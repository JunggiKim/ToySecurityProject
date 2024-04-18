package com.example.toy1.dto;

import lombok.Builder;

@Builder
public record UserDTO(
	 String role,
     String name,
     String email,
     String username
) {

	public static UserDTO of(){
		return UserDTO.builder().build();
	}

}
