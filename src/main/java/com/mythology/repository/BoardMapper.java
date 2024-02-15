package com.mythology.repository;

import com.mythology.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int insertBoard(BoardDTO params);
    public BoardDTO selectBoardDetail(Long bno);
    public int updateBoard(BoardDTO params);
    public int deleteBoard(Long bno);
    public List<BoardDTO> selectBoardList();
    public int selectBoardTotalCount();
    public boolean cntPlus(Long bno);
}
