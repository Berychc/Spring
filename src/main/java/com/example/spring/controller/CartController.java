package com.example.spring.controller;

import com.example.spring.service.CartService;
import com.example.spring.service.CartServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/store/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public void addItem(@RequestParam("id") List<Integer> ids) {
        for (int id : ids) {
            cartService.addId(id);
        }
    }

    @GetMapping("/addAll")
    public void addAllItems(@RequestParam("allId") List<Integer> allIds) {
        cartService.addAllItems(allIds);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
