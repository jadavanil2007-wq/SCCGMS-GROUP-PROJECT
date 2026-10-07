package com.sccgms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sccgms.entity.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {

}