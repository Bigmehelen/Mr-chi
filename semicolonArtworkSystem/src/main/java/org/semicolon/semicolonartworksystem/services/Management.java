package org.semicolon.semicolonartworksystem.services;

import org.semicolon.semicolonartworksystem.dtos.requests.CreateArtworkRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.CreateArtworkResponse;

import java.util.List;

public interface Management {
    CreateArtworkResponse addArtwork(CreateArtworkRequest artworkRequest);
    Long inventory();
    CreateArtworkResponse findArtworkById(String artworkId);
    void deleteArtworkById(String artworkId);
    List<CreateArtworkResponse> findAllArtwork();
}
