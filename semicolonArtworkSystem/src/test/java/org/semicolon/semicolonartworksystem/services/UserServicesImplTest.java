package org.semicolon.semicolonartworksystem.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.semicolon.semicolonartworksystem.data.models.Role;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.semicolon.semicolonartworksystem.data.repositories.UserRepo;
import org.semicolon.semicolonartworksystem.dtos.requests.LoginRequest;
import org.semicolon.semicolonartworksystem.dtos.requests.SignUpRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.LoginResponse;
import org.semicolon.semicolonartworksystem.dtos.responses.SignUpResponse;
import org.semicolon.semicolonartworksystem.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class UserServicesImplTest {
    LoginRequest request;
    LoginResponse response;
    SignUpRequest signUpRequest;
    SignUpResponse signUpResponse;

    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserServicesImpl userServices;

    @InjectMocks
    private UserServicesImpl userServicesImpl;

    @BeforeEach
    public void setUp() {
        request = new LoginRequest();
        request.setEmail("JayOne@gmail.com");
        request.setPassword("password123");

        signUpRequest = new SignUpRequest();
        signUpRequest.setUserName("JayOne");
        signUpRequest.setEmail("jayOne@gmail.com");
        signUpRequest.setRole(Role.valueOf("buyer"));

        response = new LoginResponse();
        signUpResponse = new SignUpResponse();
    }

    @Test
    public void testThatUserCanLoginWithCorrectPassword() {
        User user = Mapper.map(request);
        when(userRepo.findById(any())).thenReturn(Optional.of(user));
        LoginResponse loginResponse = userServices.login(request);
        assertNotNull(loginResponse);
    }

    @Test
    public void testThatUserCanSignUpWithCorrectFields() {
        User user = Mapper.mapToModel(signUpRequest);
        when(userRepo.save(any())).thenAnswer(i ->{
            when(userRepo.count()).thenReturn(1L);
            return i.getArguments()[0];
        });
        SignUpResponse signUpResponse = userServicesImpl.signUp(signUpRequest);
        verify(userRepo, times(1)).save(any());
        assertEquals(1L, userServicesImpl.inventory());
    }

}