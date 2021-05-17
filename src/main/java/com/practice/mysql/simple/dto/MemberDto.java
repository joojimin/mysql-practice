package com.practice.mysql.simple.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class MemberDto {
	private Integer memberId;
	private String memberName;
	private String memberAddress;
	private LocalDateTime registerTime;
	private LocalDateTime updateTime;
}
