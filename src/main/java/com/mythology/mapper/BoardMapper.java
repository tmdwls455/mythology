package com.mythology.mapper;

import com.mythology.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int insertBoard(BoardDTO params);
    public BoardDTO selectBoard(Long board_num);
    public int updateBoard(BoardDTO params);
    public int deleteBoard(Long board_num);
    public List<BoardDTO> selectBoardList();
    public int selectBoardTotalCount();
    public boolean cntPlus(Long board_num);
}
