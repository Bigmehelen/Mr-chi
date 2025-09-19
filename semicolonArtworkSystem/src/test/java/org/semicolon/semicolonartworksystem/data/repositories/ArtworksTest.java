package org.semicolon.semicolonartworksystem.data.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class ArtworksTest {
    Artwork artwork;

    @Autowired
    private Artworks artworks;

    @BeforeEach
    public void setUp() {
        artwork = new Artwork();
        artwork.setArtworkTitle("Moremi");
        artwork.setArtworkDescription("African Artwork");
        artwork.setDatePainted(LocalDate.parse("11-09-2020"));
    }

    @Test
    public void testThatOneArtworkIsSavedAndCountIsOne(){
        Artwork saved = artworks.save(artwork);
        assertEquals(1L, artworks.count());
    }

    @Test
    public void testThatOneArtworkIsSavedAndCanBeFound(){
        Artwork saved = artworks.save(artwork);
        assertEquals(1L, artworks.count());
        Optional<Artwork> found = artworks.findById(saved.getArtworkId());
        assertTrue(found.isPresent(), "Artwork should be found after saving");
        assertEquals("Moremi", found.get().getArtworkTitle(), "Artwork title should match");;
    }

}