package com.mythology.domain;

import lombok.Data;

@Data
public class MemberDTO {
    private String id;
    private String password;
    private String email;
    private String nickname;
    private int grade; // 권한
}
