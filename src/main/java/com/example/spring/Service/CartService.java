package com.example.spring.Service;


import java.util.List;

public interface CartService {

    void addItem(int id);

    List<Integer> getItems();
}
