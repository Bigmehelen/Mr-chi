package org.semicolon.semicolonartworksystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ArtworkNotFoundException extends RuntimeException {
    public ArtworkNotFoundException(String message) {
        super(message);
    }
}
