package org.semicolon.semicolonartworksystem.services;

import org.semicolon.semicolonartworksystem.dtos.requests.AddToCartRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.AddToCartResponse;

import java.math.BigDecimal;

public interface CartServices {
    AddToCartResponse addToCart(AddToCartRequest request);
}
