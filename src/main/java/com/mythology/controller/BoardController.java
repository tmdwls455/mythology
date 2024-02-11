package com.mythology.controller;

import com.mythology.domain.BoardDTO;
import com.mythology.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write.do")
    public String openBoardWrite(@RequestParam(value = "idx", required = false) Long bno, Model model) {
        if (bno == null) {
            model.addAttribute(("board"), new BoardDTO());
        } else {
            BoardDTO board = boardService.getBoardDetail(bno);
            if (board == null) {
                return "redirect:/board/list.do";
            }
            model.addAttribute("board", board);
        }

        return "board/write";
    }
}
