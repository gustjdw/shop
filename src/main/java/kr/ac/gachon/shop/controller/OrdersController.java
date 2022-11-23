package kr.ac.gachon.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "orders")
public class OrdersController {
    @GetMapping
    public String Orders() {
        return "orders/orders";
    }
}
