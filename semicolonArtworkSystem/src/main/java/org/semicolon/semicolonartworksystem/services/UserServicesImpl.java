package org.semicolon.semicolonartworksystem.services;

import org.semicolon.semicolonartworksystem.data.models.User;
import org.semicolon.semicolonartworksystem.data.repositories.UserRepo;
import org.semicolon.semicolonartworksystem.dtos.requests.LoginRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.SignUpRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.LoginResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.SignUpResponse;
import org.semicolon.semicolonartworksystem.exceptions.UserNotFoundException;
import org.semicolon.semicolonartworksystem.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepo userRepo;

    @Override
    public LoginResponse login(LoginRequest request) {
        User user = Mapper.map(request);
        User saved = userRepo.findByEmail(user.getEmail())
                .orElseThrow(()-> new UserNotFoundException("User not found"));
        return Mapper.map(saved);
    }

    @Override
    public SignUpResponse signUp(SignUpRequest request) {
        User user = Mapper.mapToModel(request);
        User saved = userRepo.save(user);
        return Mapper.mapToEntity(saved);
    }

    @Override
    public Long inventory() {
        return userRepo.count();
    }

}
