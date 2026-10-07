package com.sccgms.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer complaint_id;
    @Column(nullable = false)
    private Integer student_id;
    @Column(nullable = false, length = 150)
    private String title;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false, length = 50)
    private String category;
    @Column(nullable = false, length = 20)
    private String priority;
    @Column(nullable = false, length = 30)

    private String status = "Pending";
    private LocalDateTime created_at;
    private LocalDateTime resolved_at;
    public Complaint() {
    }
    public Integer getComplaint_id() {
        return complaint_id;
    }
    public void setComplaint_id(Integer complaint_id) {
        this.complaint_id = complaint_id; }
    public Integer getStudent_id() {
        return student_id;
    }
    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }
    public String getTitle() {
        return title;}
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
    public LocalDateTime getResolved_at() {
        return resolved_at;
    }
    public void setResolved_at(LocalDateTime resolved_at) {
        this.resolved_at = resolved_at;
    }
}