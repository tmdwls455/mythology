package com.mythology.controller;

import com.mythology.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write.do")
    public String openBoardWrite(Model model) {
        String title = "타이틀";
        String content = "내용";
        String writer = "저자";

        model.addAttribute("title", title);
        model.addAttribute("content", content);
        model.addAttribute("writer", writer);

        return "board/write";
    }
}
