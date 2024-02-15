package com.mythology.service.impl;

import com.mythology.domain.Member;
import com.mythology.repository.MemberRepository;
import com.mythology.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public String join(Member member) {


        return null;
    }
}
