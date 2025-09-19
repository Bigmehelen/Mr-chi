package org.semicolon.semicolonartworksystem.data.repositories;

import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Artworks extends MongoRepository<Artwork, String> {

}
