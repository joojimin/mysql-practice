package com.practice.mysql.simple.mapper;

import com.practice.mysql.simple.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SimpleTestMapper {
	List<MemberDto> selectMembers();
}
