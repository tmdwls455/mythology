package com.mythology.controller;

import com.mythology.domain.MemberDTO;
import com.mythology.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member/new")
    public String createMemberForm() {
        return "member/createMemberForm";
    }

    @PostMapping("/member/new")
    public String createMember(MemberDTO memberDTO) {
        String memberId = memberService.join(memberDTO);

        return "home";
    }
}
