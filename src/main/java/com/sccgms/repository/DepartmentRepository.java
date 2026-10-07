package com.sccgms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sccgms.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}