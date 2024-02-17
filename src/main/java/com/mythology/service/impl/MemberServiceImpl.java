package com.mythology.service.impl;

import com.mythology.domain.MemberDTO;
import com.mythology.mapper.MemberMapper;
import com.mythology.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public boolean memberJoin(MemberDTO params) {
        int queryResult = 0;

        if (params.getId() == null && params.getEmail() == null) {
            queryResult = memberMapper.createMember(params);
        }

        return queryResult == 1;
    }
}
