package org.semicolon.semicolonartworksystem.data.repositories;

import org.junit.jupiter.api.Test;
import org.semicolon.semicolonartworksystem.data.models.Role;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class UserRepoTest {

    @Autowired
    private UserRepo userRepo;

    @Test
    public void testThatOneUserCanSignUp() {
        User user = new User();
        user.setUserName("Justice");
        user.setEmail("justice@gmail.com");
        user.setRole(Role.valueOf("admin"));
        user.setPassword("password123");
        userRepo.save(user);
        assertEquals(1L, userRepo.count());
    }

}