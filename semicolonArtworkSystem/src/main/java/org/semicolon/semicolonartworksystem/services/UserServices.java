package org.semicolon.semicolonartworksystem.services;

import org.semicolon.semicolonartworksystem.dtos.requests.LoginRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.SignUpRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.LoginResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.SignUpResponse;

public interface UserServices {
    LoginResponse login(LoginRequest request);
    SignUpResponse signUp(SignUpRequest request);
    Long inventory();
}
