package com.example.spring.Controller;

import com.example.spring.Service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/order/add")
    public void addItem(@RequestParam("id") int[] ids) {
        for (int id : ids) {
            cartService.addItem(id);
        }
    }

    @GetMapping("/order/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }

}
