package com.mythology.mapper;

import com.mythology.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public int createMember(MemberDTO params);
}