package com.example.toy1.domain.user.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
public record UserSignUpDTO(
	String email ,
	String password,
	String nickName,
	int age,
	String city
	) {


}
