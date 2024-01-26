package com.example.spring.service;


import java.util.List;

public interface CartService {

    void addId(int id);
    void addAllItems(List<Integer> allId);
    List<Integer> getItems();
}
