package com.mythology.service;

import com.mythology.domain.BoardDTO;
import com.mythology.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public boolean registerBoard(BoardDTO params) {
        int queryResult = 0;
        return false;
    }

    @Override
    public BoardDTO getBoardDetail(long bno) {
        return null;
    }

    @Override
    public boolean deleteBoard(BoardDTO params) {
        return false;
    }

    @Override
    public List<BoardDTO> getBoardList() {
        return null;
    }

    @Override
    public boolean cntPlus(long bno) {
        return false;
    }
}
