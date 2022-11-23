package kr.ac.gachon.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin")
public class ItemController {
    @GetMapping(value = "item/new")
    public String itemForm(Model model) {
        return "item/itemForm";
    }

    @GetMapping(value = "items")
    public String items(Model model) {
        return "item/items";
    }
}