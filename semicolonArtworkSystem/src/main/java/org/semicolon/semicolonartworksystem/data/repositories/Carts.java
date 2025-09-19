package org.semicolon.semicolonartworksystem.data.repositories;

import org.semicolon.semicolonartworksystem.data.models.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Carts extends MongoRepository<Cart, String> {

}
