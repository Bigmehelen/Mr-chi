package org.semicolon.semicolonartworksystem.dtos.responses;

import lombok.Data;
import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
@Data
public class AddToCartResponse {
    private String cartId;
    private Artwork artwork;
    private int quantity;
}
