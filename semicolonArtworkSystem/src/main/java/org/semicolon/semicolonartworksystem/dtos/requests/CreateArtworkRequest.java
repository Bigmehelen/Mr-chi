package org.semicolon.semicolonartworksystem.dtos.requests;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class  CreateArtworkRequest {
    private String artworkTitle;
    private String artworkDescription;
    private String artworkImageUrl;
    private LocalDate datePainted;
    private Boolean isAvailable;
    private int stock;
    private BigDecimal price;

}
