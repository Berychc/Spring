package com.example.spring.service;

import com.example.spring.product.CartItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceIml implements CartService {

    private final List<CartItem> items = new ArrayList<>();

    @Override
    public void addItem(int id) {
        items.add(new CartItem(id));
    }

    @Override
    public void addAllItems(List<Integer> allId) {
        items.addAll(new ArrayList<>());
    }

    @Override
    public List<Integer> getItems() {
        return items.stream().map(CartItem::getItemId).collect(Collectors.toList());
    }
}


