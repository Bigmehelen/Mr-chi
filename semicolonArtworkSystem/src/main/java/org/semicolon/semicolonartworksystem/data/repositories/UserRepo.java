package org.semicolon.semicolonartworksystem.data.repositories;

import org.semicolon.semicolonartworksystem.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
