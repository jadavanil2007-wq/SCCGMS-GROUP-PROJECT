package com.sccgms.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Complaint_History")
public class ComplaintHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer history_id;

    @Column(nullable = false)
    private Integer complaint_id;

    @Column(length = 30)
    private String old_status;

    @Column(nullable = false, length = 30)
    private String new_status;

    @Column(nullable = false)
    private Integer updated_by;

    @Column(length = 255)
    private String remarks;

    private LocalDateTime updated_at;

    public ComplaintHistory() {
    }
    public Integer getHistory_id() {
        return history_id;
    }
    public void setHistory_id(Integer history_id) {
        this.history_id = history_id;
    }
    public Integer getComplaint_id() {
        return complaint_id;
    }
    public void setComplaint_id(Integer complaint_id) {
        this.complaint_id = complaint_id;
    }
    public String getOld_status() {
        return old_status;
    }
    public void setOld_status(String old_status) {
        this.old_status = old_status;
    }
    public String getNew_status() {
        return new_status;
    }
    public void setNew_status(String new_status) {
        this.new_status = new_status;
    }
    public Integer getUpdated_by() {
        return updated_by;
    }
    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public LocalDateTime getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}