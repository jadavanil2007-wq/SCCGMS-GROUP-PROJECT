package com.sccgms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sccgms.entity.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

}