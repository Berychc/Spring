package com.example.spring.product;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> basketList = new ArrayList<>();

    public void add(int id) {
        basketList.add(id);
    }

    public List<Integer> getItemId() {
        return basketList;
    }

    public void addAllItems(List<Integer> items) {
        basketList.addAll(items);
    }
}