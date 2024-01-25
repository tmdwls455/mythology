package com.mythology.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardDTO {
    // mySQL 쿼리
    /* main_board(
	board_num not null auto_increment, // 게시글 번호
	board_type varchar(10) not null, // 게시글 타입
	board_ethnic varchar(15) not null, // 게시글 말머리
	board_title varchar(50) not null, // 게시글 제목
	board_writer varchar(30) not null, // 게시글 작성자
	board_content text not null, // 게시글 내용
	board_regDate timestamp not null default now(), // 게시글 등록일
	board_openDate timestamp, // 게시글 공개기한
	board_viewCnt int default 0, // 게시글 조회수
	board_recCnt int default 0, // 게시글 추천수
	board_buyCnt int default 0, // 게시글 구매수
	primary key(board_num)
    ); */

    private int board_num;
    private String board_type;
    private String board_ethnic;
    private String board_title;
    private String board_writer;
    private String board_content;
    private Date board_regDate;
    private Date board_openDate;
    private int board_viewCnt;
    private int board_recCnt;
    private int board_buyCnt;
}
