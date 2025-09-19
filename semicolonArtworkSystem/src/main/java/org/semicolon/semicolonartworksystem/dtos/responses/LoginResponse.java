package org.semicolon.semicolonartworksystem.dtos.responses;

import lombok.Data;
import org.semicolon.semicolonartworksystem.data.models.Role;
@Data
public class LoginResponse {
    private String userId;
    private String email;
}
