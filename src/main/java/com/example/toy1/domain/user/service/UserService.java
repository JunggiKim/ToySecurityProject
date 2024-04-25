package com.example.toy1.domain.user.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.toy1.domain.user.Role;
import com.example.toy1.domain.user.UserEntity;
import com.example.toy1.domain.user.dto.UserSignUpDTO;
import com.example.toy1.domain.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void signUp(UserSignUpDTO userSignUpDto) throws Exception {

        signUpValuation(userSignUpDto);

        UserEntity user = UserEntity.of(userSignUpDto);

        user.passwordEncode(passwordEncoder);
        userRepository.save(user);
    }


    private void signUpValuation(UserSignUpDTO userSignUpDto) throws Exception {
        if (userRepository.findByEmail(userSignUpDto.email()).isPresent()) {
            throw new Exception("이미 존재하는 이메일입니다.");
        }

        if (userRepository.findByNickname(userSignUpDto.nickName()).isPresent()) {
            throw new Exception("이미 존재하는 닉네임입니다.");
        }
    }

}
