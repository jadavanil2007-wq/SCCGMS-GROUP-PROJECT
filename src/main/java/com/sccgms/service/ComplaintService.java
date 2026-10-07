package com.sccgms.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sccgms.entity.Complaint;
import com.sccgms.repository.ComplaintRepository;
@Service
public class ComplaintService {
    private final ComplaintRepository complaintRepository;
    public ComplaintService(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }
    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }
    public Complaint getComplaintById(Integer id) {
        return complaintRepository.findById(id).orElse(null);
    }
    public Complaint saveComplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }
    public Complaint updateComplaint(Integer id, Complaint complaint) {
        Complaint existingComplaint =
                complaintRepository.findById(id).orElse(null);
        if (existingComplaint != null) {
            existingComplaint.setStudent_id(complaint.getStudent_id());
            existingComplaint.setTitle(complaint.getTitle());
            existingComplaint.setDescription(complaint.getDescription());
            existingComplaint.setCategory(complaint.getCategory());
            existingComplaint.setPriority(complaint.getPriority());
            existingComplaint.setStatus(complaint.getStatus());
            existingComplaint.setResolved_at(complaint.getResolved_at());
            return complaintRepository.save(existingComplaint);
        }
        return null;
    }
    public void deleteComplaint(Integer id) {
        complaintRepository.deleteById(id);
    }
}