package com.example.spring.service;

import com.example.spring.product.Cart;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CartServiceIml implements CartService {

    private final Cart cart;

    public CartServiceIml(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addId(int id) {
        cart.add(id);
    }

    @Override
    public void addAllItems(List<Integer> allId) {
        cart.addAllItems(allId);
    }

    @Override
    public List<Integer> getItems() {
        return Collections.unmodifiableList(cart.getItemId());
    }
}


