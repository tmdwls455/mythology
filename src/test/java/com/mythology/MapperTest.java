package com.mythology;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mythology.domain.BoardDTO;
import com.mythology.repository.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void testInsert() {
        BoardDTO params = new BoardDTO();
        params.setType("전설");
        params.setEthnic("유럽");
        params.setTitle("2222");
        params.setContent("2 내용");
        params.setWriter("ㅇㅇ");

        int result = boardMapper.insertBoard(params);
        System.out.println("결과 ------------> "+result);
    }
    @Test
    public void testSelectDetail() {
        BoardDTO board = boardMapper.selectBoardDetail((long)1);
        try {
            String boardJson = new ObjectMapper().writeValueAsString(board);
            System.out.println("============================");
            System.out.println(boardJson);
            System.out.println("============================");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testUpdate() {
        BoardDTO params = new BoardDTO();
        params.setType("소설");
        params.setEthnic("영국");
        params.setTitle("수정");
        params.setContent("수정한 내용");
        params.setWriter("수정자");
        params.setBno((long) 1);

        int result = boardMapper.updateBoard(params);
        System.out.println("결과 ------------> "+result);
    }

    @Test
    public void testDelete() {
        int result = boardMapper.deleteBoard((long) 1);
        System.out.println("결과 ------------> "+result);
    }

}
