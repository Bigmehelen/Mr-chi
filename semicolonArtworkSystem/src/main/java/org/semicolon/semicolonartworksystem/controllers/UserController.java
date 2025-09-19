package org.semicolon.semicolonartworksystem.controllers;

import lombok.extern.slf4j.Slf4j;
import org.semicolon.semicolonartworksystem.dtos.requests.LoginRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.SignUpRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.LoginResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.SignUpResponse;
import org.semicolon.semicolonartworksystem.exceptions.InvalidEmailException;
import org.semicolon.semicolonartworksystem.services.UserServicesImpl;
import org.semicolon.semicolonartworksystem.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/require")
@Slf4j
public class UserController {

    @Autowired
    private UserServicesImpl userServicesImpl;

    @PostMapping("/find-login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        if(!Validator.isValidEmail(request.getEmail())) {
            throw new InvalidEmailException("Invalid email format");
        }
       return userServicesImpl.login(request);
    }

    @PostMapping("/enter-signup")
    public SignUpResponse signUp(@RequestBody SignUpRequest request) {
        if(!Validator.isValidEmail(request.getEmail())) {
            throw new InvalidEmailException("Invalid email format");
        }
        return userServicesImpl.signUp(request);
    }
}


