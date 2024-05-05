package com.example.toy1.domain.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.toy1.domain.user.dto.RequestUserSignUpDTO;
// import com.example.toy1.domain.user.service.UserService;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@Builder
public class UserController {

    // private final UserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity signUp(@RequestBody RequestUserSignUpDTO requestUserSignUpDto) throws Exception {
        System.out.println("요청 옴");

        // return ResponseEntity.ok(userService.signUp(requestUserSignUpDto));

        return ResponseEntity.ok("");
    }

    @GetMapping("/jwt-test")
    public String jwtTest() {
        return "jwtTest 요청 성공";
    }
}