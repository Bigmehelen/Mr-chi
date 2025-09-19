package org.semicolon.semicolonartworksystem.dtos.requests;

import lombok.Data;
import org.semicolon.semicolonartworksystem.data.models.Role;

@Data
public class SignUpRequest {
    private String userName;
    private String email;
    private Role role;
    private String password;
}
