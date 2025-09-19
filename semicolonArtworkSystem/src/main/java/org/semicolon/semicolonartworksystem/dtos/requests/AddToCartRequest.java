package org.semicolon.semicolonartworksystem.dtos.requests;

import lombok.Data;
import org.semicolon.semicolonartworksystem.data.models.Artwork;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class AddToCartRequest {
    private int quantity;
    private Artwork artwork;
    private User user;
}
