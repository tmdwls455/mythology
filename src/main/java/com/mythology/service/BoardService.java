package com.mythology.service;

import com.mythology.domain.BoardDTO;

import java.util.List;

public interface BoardService {

    public boolean registerBoard(BoardDTO params);
    public BoardDTO getBoardDetail(long bno);
    public boolean deleteBoard(BoardDTO params);
    public List<BoardDTO> getBoardList();
    public boolean cntPlus(long bno);
}
