package org.semicolon.semicolonartworksystem.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.semicolon.semicolonartworksystem.data.models.Cart;
import org.semicolon.semicolonartworksystem.data.models.User;
import org.semicolon.semicolonartworksystem.data.repositories.Carts;
import org.semicolon.semicolonartworksystem.data.repositories.UserRepo;
import org.semicolon.semicolonartworksystem.dtos.requests.AddToCartRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.AddToCartResponse;
import org.semicolon.semicolonartworksystem.exceptions.UserNotFoundException;
import org.semicolon.semicolonartworksystem.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CartServicesImplTest {
    AddToCartRequest addToCart;
    AddToCartResponse response;

    @Mock
    private Carts carts;

    @InjectMocks
    private CartServicesImpl cartServices;

    @InjectMocks
    private UserRepo userRepo;

    @BeforeEach
    public void setUp() {
        addToCart = new AddToCartRequest();
        addToCart.setQuantity(1);

        response = new AddToCartResponse();
    }

    @Test
    public void testThatAddToCartRequestIsValid() {
        Cart cart = Mapper.mapToModel(addToCart);
        when(carts.save(any())).thenAnswer(i ->{
            when(carts.count()).thenReturn(i.getArgument(0));
            return i.getArguments()[0];
        });
        AddToCartResponse sent = cartServices.addToCart(addToCart);
        verify(carts, times(1)).save(any());

    }

}