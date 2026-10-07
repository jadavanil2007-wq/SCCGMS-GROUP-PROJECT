package com.sccgms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sccgms.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}