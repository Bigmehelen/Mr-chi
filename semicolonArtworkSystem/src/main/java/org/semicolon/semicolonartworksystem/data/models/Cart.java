package org.semicolon.semicolonartworksystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
@Data
@Document
public class Cart {
    @Id
    private String cartId;
    private Artwork artwork;
    private int quantity;

    @DBRef
    private User user;
}
