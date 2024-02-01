package com.mythology.service;

import com.mythology.domain.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService {

    public boolean registerBoard(BoardDTO params);
    public BoardDTO getBoardDetail(Long bno);
    public boolean deleteBoard(Long bno);
    public List<BoardDTO> getBoardList();
    public boolean cntPlus(Long bno);
}
