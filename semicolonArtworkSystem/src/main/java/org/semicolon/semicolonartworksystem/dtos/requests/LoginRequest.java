package org.semicolon.semicolonartworksystem.dtos.requests;

import lombok.Data;
import lombok.ToString;
import org.semicolon.semicolonartworksystem.data.models.Role;

@Data
@ToString
public class LoginRequest {
    private String email;
    private String password;
}
