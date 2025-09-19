package org.semicolon.semicolonartworksystem.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.semicolon.semicolonartworksystem.data.repositories.Artworks;
import org.semicolon.semicolonartworksystem.dtos.requests.CreateArtworkRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.CreateArtworkResponse;
import org.semicolon.semicolonartworksystem.exceptions.ArtworkNotFoundException;
import org.semicolon.semicolonartworksystem.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ManagementImplTest {
    private CreateArtworkRequest artworkRequest;
    private CreateArtworkRequest artworkRequestTwo;
    private CreateArtworkResponse artworkResponse;
    private CreateArtworkResponse artworkResponseTwo;

    @Mock
    private Artworks artworks;

    @InjectMocks
    private ManagementImpl managementImpl;

    @BeforeEach
    public void setup() {
        artworkRequest = new CreateArtworkRequest();
        artworkRequest.setArtworkTitle("Moremi");
        artworkRequest.setArtworkDescription("African Giant Artwork");
        artworkRequest.setDatePainted(LocalDate.parse("2018-04-04"));
        artworkRequest.setArtworkImageUrl("https:moremi.com");

        artworkRequestTwo = new CreateArtworkRequest();
        artworkRequestTwo.setArtworkTitle("justice");
        artworkRequestTwo.setArtworkDescription("This is justice");
        artworkRequestTwo.setDatePainted(LocalDate.parse("2018-08-09"));
        artworkRequestTwo.setArtworkImageUrl("https:justice.com");

        artworkResponse = new CreateArtworkResponse();
        artworkResponseTwo = new CreateArtworkResponse();
    }

    @Test
    public void testThatOneArtworkIsAdded() {
        Artwork artwork = Mapper.map(artworkRequest);
        when(artworks.save(any())).thenAnswer(i -> {
            when(artworks.count()).thenReturn(1L);
            return i.getArguments()[0];
        });

        CreateArtworkResponse sent = managementImpl.addArtwork(artworkRequest);
        verify(artworks, times(1)).save(any());
        assertEquals(artworkRequest.getArtworkTitle(), sent.getArtworkTitle());
        assertEquals(1L, managementImpl.inventory());
    }

    @Test
    public void testThatArtWorkIsAddedAndFoundById() {
        Artwork artwork = Mapper.map(artworkRequest);
        when(artworks.findById(any())).thenReturn(Optional.of(artwork));
        CreateArtworkResponse sent = managementImpl.findArtworkById(artwork.getArtworkId());
        assertNotNull(sent);
    }

    @Test
    public void testThatCanDeleteArtworkWhenIdExists() {
        Artwork artwork = Mapper.map(artworkRequest);
        when(artworks.findById(any())).thenReturn(Optional.of(artwork));
        managementImpl.deleteArtworkById(artwork.getArtworkId());
        verify(artworks, times(1)).deleteById(any());
        verify(artworks, times(1)).findById(any());
    }

    @Test
    public void testThatCanThrowExceptionWhenArtworkNotFound() {
        Artwork artwork = Mapper.map(artworkRequest);
        when(artworks.findById(any())).thenReturn(Optional.empty());
        assertThrowsExactly(ArtworkNotFoundException.class, ()-> managementImpl.findArtworkById(artwork.getArtworkId()));
    }

    @Test
    public void testThatTwoArtworksAreAddedAndCanFindAll() {
        Artwork artwork = Mapper.map(artworkRequest);
        Artwork artworkTwo = Mapper.map(artworkRequestTwo);
        when(artworks.findAll()).thenReturn(Arrays.asList(artwork, artworkTwo));
        assertEquals(2L, managementImpl.findAllArtwork().size());
        CreateArtworkResponse sent = managementImpl.findAllArtwork().get(0);
    }

}