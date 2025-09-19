package org.semicolon.semicolonartworksystem.services;

import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.semicolon.semicolonartworksystem.data.repositories.Artworks;
import org.semicolon.semicolonartworksystem.dtos.requests.CreateArtworkRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.CreateArtworkResponse;
import org.semicolon.semicolonartworksystem.exceptions.ArtworkNotFoundException;
import org.semicolon.semicolonartworksystem.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagementImpl implements Management{

    @Autowired
    private Artworks artworks;
    @Override
    public CreateArtworkResponse addArtwork(CreateArtworkRequest artworkRequest) {
        Artwork artwork = Mapper.map(artworkRequest);
        Artwork saved = artworks.save(artwork);
        return Mapper.map(saved);
    }
    @Override
    public Long inventory() {
        return artworks.count();
    }

    @Override
    public CreateArtworkResponse findArtworkById(String artworkId) {
        Artwork artwork = artworks.findById(artworkId)
                .orElseThrow(() -> new ArtworkNotFoundException("artwork not found"));
        return Mapper.map(artwork);
    }

    @Override
    public void deleteArtworkById(String artworkId) {
        Artwork artwork = artworks.findById(artworkId)
                .orElseThrow(() -> new ArtworkNotFoundException("artwork not found"));
        artworks.delete(artwork);
    }

    @Override
    public List<CreateArtworkResponse> findAllArtwork() {
        List<Artwork> artworkList = artworks.findAll();
        List<CreateArtworkResponse> responses = new ArrayList<>();
        for (Artwork artwork : artworkList) {
            CreateArtworkResponse artworkResponse = Mapper.map(artwork);
            responses.add(artworkResponse);
        }
        return responses;
    }
}
