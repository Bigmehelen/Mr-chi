package org.semicolon.semicolonartworksystem.utils;

import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.semicolon.semicolonartworksystem.data.models.Cart;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.semicolon.semicolonartworksystem.dtos.requests.AddToCartRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.CreateArtworkRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.LoginRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.SignUpRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.AddToCartResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.CreateArtworkResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.LoginResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.SignUpResponse;


public class Mapper {

    public static Artwork map(CreateArtworkRequest artworkRequest) {
        Artwork artwork = new Artwork();
        artwork.setArtworkTitle(artworkRequest.getArtworkTitle());
        artwork.setArtworkDescription(artworkRequest.getArtworkDescription());
        artwork.setDatePainted(artworkRequest.getDatePainted());
        artwork.setArtworkImageUrl(artworkRequest.getArtworkImageUrl());
        artwork.setIsAvailable(artworkRequest.getIsAvailable());
        artwork.setStock(artworkRequest.getStock());
        artwork.setPrice(artworkRequest.getPrice());
        return artwork;
    }

    public static CreateArtworkResponse map(Artwork entity){
        CreateArtworkResponse response = new CreateArtworkResponse();
        response.setArtworkId(entity.getArtworkId());
        response.setArtworkTitle(entity.getArtworkTitle());
        response.setArtworkDescription(entity.getArtworkDescription());
        response.setDatePainted(entity.getDatePainted());
        response.setArtworkImageUrl(entity.getArtworkImageUrl());
        response.setIsAvailable(entity.getIsAvailable());
        response.setStock(entity.getStock());
        response.setPrice(entity.getPrice());
        return response;
    }

    public static User map(LoginRequest request) {
        User entity = new User();
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        return entity;
    }

    public static LoginResponse map(User user) {
        LoginResponse saved = new LoginResponse();
        saved.setUserId(user.getUserId());
        saved.setEmail(user.getEmail());
        return saved;
    }

    public static User mapToModel(SignUpRequest request){
        User users = new User();
        users.setUserName(request.getUserName());
        users.setEmail(request.getEmail());
        users.setRole(request.getRole());
        users.setPassword(request.getPassword());
        return users;
    }

    public static SignUpResponse mapToEntity(User entity){
        SignUpResponse responses = new SignUpResponse();
        responses.setUserId(entity.getUserId());
        responses.setUserName(entity.getUserName());
        responses.setRole(entity.getRole());
        responses.setEmail(entity.getEmail());
        return responses;
    }

    public static Cart mapToModel(AddToCartRequest request){
        Cart cart = new Cart();
        cart.setQuantity(request.getQuantity());
        cart.setArtwork(request.getArtwork());
        cart.setUser(request.getUser());
        return cart;
    }

    public static AddToCartResponse mapToResponse(Cart request ){
        AddToCartResponse response = new AddToCartResponse();
        response.setCartId(request.getCartId());
        response.setQuantity(request.getQuantity());
        return response;
    }
}
