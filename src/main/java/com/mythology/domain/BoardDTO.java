package com.mythology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class BoardDTO {
    // mySQL 쿼리
    /* #테이블
    create table board(
    bno int not null auto_increment comment '게시글 번호(PK)',
    type varchar(10) not null comment '타입',
    ethnic varchar(15) not null comment '말머리',
    title varchar(50) not null comment '제목',
    content text not null comment '내용',
    writer varchar(30) not null comment '작성자',
    viewCnt int default 0 comment '조회수',
    recCnt int default 0 comment '추천수',
    buyCnt int default 0 comment '구입수',
    regDate timestamp not null default now() comment '등록일',
    updDate timestamp null comment '수정일',
    delDate timestamp null comment '삭제일',
    openDate timestamp null comment '공개 기한',
    notice_yn enum('Y', 'N') not null default 'N' comment '공지글 여부',
    delete_yn enum('Y', 'N') not null default 'N' comment '삭제글 여부',
    secret_yn enum('Y', 'N') not null default 'N' comment '비밀글 여부',
    primary key(bno)
    ) comment '게시판';
    */

    private Long bno;
    private String type;
    private String ethnic;
    private String title;
    private String content;
    private String writer;
    private int viewCnt;
    private int recCnt;
    private int buyCnt;
    private Date regDate;
    private Date updDate;
    private Date delDate;
    private Date openDate;
    private String noticeYn;
    private String deleteYn;
    private String secretYn;
}
