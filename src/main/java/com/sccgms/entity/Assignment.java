package com.sccgms.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignment_id;

    @Column(nullable = false)
    private Integer complaint_id;

    @Column(nullable = false)
    private Integer staff_id;

    @Column(nullable = false)
    private Integer department_id;

    private LocalDateTime assigned_at;

    public Assignment() {
    }
    public Integer getAssignment_id() {
        return assignment_id;
    }
    public void setAssignment_id(Integer assignment_id) {
        this.assignment_id = assignment_id;
    }
    public Integer getComplaint_id() {
        return complaint_id;
    }
    public void setComplaint_id(Integer complaint_id) {
        this.complaint_id = complaint_id;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public LocalDateTime getAssigned_at() {
        return assigned_at;
    }

    public void setAssigned_at(LocalDateTime assigned_at) {
        this.assigned_at = assigned_at;
    }
}