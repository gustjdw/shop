package kr.ac.gachon.shop.controller;

import kr.ac.gachon.shop.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "board")
@RequiredArgsConstructor
public class BoardController {

    @GetMapping
    public String board(Model model) {
        return "board/board";
    }

    @GetMapping(value = "create")
    public String boardCreate(Model model) {
        model.addAttribute("boardDto", new BoardDto());
        return "board/create";
    }
}
