package com.example.spring.service;


import java.util.List;

public interface CartService {

    void addItem(int id);

    void addAllItems(List<Integer> allId);

    List<Integer> getItems();
}
