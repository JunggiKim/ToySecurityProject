package com.example.toy1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.toy1.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}