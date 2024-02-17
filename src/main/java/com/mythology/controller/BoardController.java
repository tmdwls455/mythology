package com.mythology.controller;

import com.mythology.domain.BoardDTO;
import com.mythology.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    @Autowired
    private final BoardService boardService;


    @GetMapping("/board/write.do")
    public String openBoardWrite(@RequestParam(value = "bno", required = false) Long bno, Model model) {
        // 게시글 작성 페이지
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

    @GetMapping(value = "/board/list.do")
    public String openBoardList(Model model) {
        // 게시글 리스트
        List<BoardDTO> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);

        return "board/list";
    }

    @GetMapping("/board/view.do")
    public String openBoardDetail(@RequestParam(value = "bno", required = false) Long bno, Model model) {
        // 게시글 읽기
        if (bno == null) {
            // 올바르지 않은 접근입니다
            return "redirect:/board/list.do";
        }
        BoardDTO board = boardService.getBoardDetail(bno);


        if (board == null || "Y".equals(board.getDeleteYn())) {
            // 없는 게시글이거나 삭제된 게시글일 때
            return  "redirect:/board/list.do";
        }
        model.addAttribute("board", board);
        boardService.cntPlus(bno);

        return "board/view";
    }

    @PostMapping("/board/delete.do")
    public String deleteBoard(@RequestParam(value="idx", required = false)
                              Long idx) {
        // 게시글 삭제
        if(idx==null) {
            //올바르지 않은 접근
            return "redirect:/board/list.do";
        }
        try {
            boolean isDeleted = boardService.deleteBoard(idx);
            if(isDeleted==false) {
                //게시글 삭제 실패
            }
        } catch(DataAccessException e) {
            //데이터 베이스 처리과정에 문제 발생
        } catch(Exception e) {
            //시스템 문제 발생
        }
        return "redirect:/board/list.do";
    }


}
