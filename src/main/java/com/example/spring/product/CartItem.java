package com.example.spring.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@SessionScope
public class CartItem {
    private int itemId;
    private final List<Integer> basketList = new ArrayList<>();

    @Autowired
    public CartItem(int id) {
        this.itemId = id;
    }

    public int getItemId() {
        return itemId;
    }

    public List<Integer> getBasketList() {
        return basketList;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void addAllItems(Integer[] items) {
        basketList.addAll(Arrays.asList(items));
    }
}