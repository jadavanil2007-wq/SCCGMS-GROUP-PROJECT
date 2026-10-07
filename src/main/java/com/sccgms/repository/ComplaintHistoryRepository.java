package com.sccgms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sccgms.entity.ComplaintHistory;

public interface ComplaintHistoryRepository extends JpaRepository<ComplaintHistory, Integer> {

}