package org.semicolon.semicolonartworksystem.services;

import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.semicolon.semicolonartworksystem.data.models.Cart;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.semicolon.semicolonartworksystem.data.repositories.Artworks;
import org.semicolon.semicolonartworksystem.data.repositories.Carts;
import org.semicolon.semicolonartworksystem.data.repositories.UserRepo;
import org.semicolon.semicolonartworksystem.dtos.requests.AddToCartRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.AddToCartResponse;
import org.semicolon.semicolonartworksystem.exceptions.ArtworkNotFoundException;
import org.semicolon.semicolonartworksystem.exceptions.UserNotFoundException;
import org.semicolon.semicolonartworksystem.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServicesImpl implements CartServices {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private Artworks artworks;

    @Autowired
    private Carts carts;

    @Override
    public AddToCartResponse addToCart(AddToCartRequest request) {

        return null;
    }

}

