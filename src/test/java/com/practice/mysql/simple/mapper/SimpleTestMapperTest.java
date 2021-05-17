package com.practice.mysql.simple.mapper;

import com.practice.mysql.BaseMapperTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


class SimpleTestMapperTest extends BaseMapperTest {

	@Autowired
	private SimpleTestMapper simpleTestMapper;

	@Test
	void selectMembers() {
		assertThat(simpleTestMapper.selectMembers())
			.isNotEmpty();
	}
}
