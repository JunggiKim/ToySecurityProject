package com.example.toy1.domain.user.dto;

import lombok.Builder;

@Builder
public record RequestUserSignUpDTO(
	String email ,
	String password,
	String nickName,
	int age,
	String city
	) {


}
