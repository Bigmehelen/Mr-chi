package org.semicolon.semicolonartworksystem.dtos.responses;

import lombok.Data;
import org.semicolon.semicolonartworksystem.data.models.Role;
@Data
public class SignUpResponse {
    private String userId;
    private String userName;
    private String email;
    private Role role;
}
