package org.semicolon.semicolonartworksystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String email;
    private Role role;
}
