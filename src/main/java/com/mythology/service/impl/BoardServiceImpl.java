package com.mythology.service.impl;

import com.mythology.domain.BoardDTO;
import com.mythology.mapper.BoardMapper;
import com.mythology.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public boolean registerBoard(BoardDTO params) {
        int queryResult = 0;
        if(params.getBno() == null) {
            queryResult = boardMapper.insertBoard(params);
        } else {
            queryResult = boardMapper.updateBoard(params);
        }
        // 1이면 true, 아니면 false 반환
        return queryResult == 1;
    }

    @Override
    public BoardDTO getBoardDetail(Long bno) {
        return boardMapper.selectBoardDetail(bno);
    }

    @Override
    public boolean deleteBoard(Long bno) {
        int queryResult = 0;
        BoardDTO board = board = boardMapper.selectBoardDetail(bno);

        if (board!=null && "N".equals(board.getDeleteYn())) {
            queryResult = boardMapper.deleteBoard(bno);
        }
        // 1이면 true, 아니면 false 반환
        return queryResult == 1;
    }

    @Override
    public List<BoardDTO> getBoardList() {
        List<BoardDTO> boardList = Collections.emptyList();
        int boardTotalCount = boardMapper.selectBoardTotalCount();

        if (boardTotalCount>0) {
            boardList = boardMapper.selectBoardList();
        }

        return boardList;
    }

    @Override
    public boolean cntPlus(Long bno) {
        return boardMapper.cntPlus(bno);
    }
}
