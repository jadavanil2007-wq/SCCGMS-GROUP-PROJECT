package com.sccgms.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sccgms.entity.ComplaintHistory;
import com.sccgms.repository.ComplaintHistoryRepository;
@Service
public class ComplaintHistoryService {
    private final ComplaintHistoryRepository complaintHistoryRepository;
    public ComplaintHistoryService(
            ComplaintHistoryRepository complaintHistoryRepository) {
        this.complaintHistoryRepository = complaintHistoryRepository;
    }
    public List<ComplaintHistory> getAllHistory() {
        return complaintHistoryRepository.findAll();
    }
    public ComplaintHistory getHistoryById(Integer id) {
        return complaintHistoryRepository.findById(id).orElse(null);
    }
    public ComplaintHistory saveHistory(ComplaintHistory history) {
        return complaintHistoryRepository.save(history);
    }
    public ComplaintHistory updateHistory(
            Integer id, ComplaintHistory history) {
        ComplaintHistory existingHistory =
                complaintHistoryRepository.findById(id).orElse(null);
        if (existingHistory != null) {
            existingHistory.setComplaint_id(history.getComplaint_id());
            existingHistory.setOld_status(history.getOld_status());
            existingHistory.setNew_status(history.getNew_status());
            existingHistory.setUpdated_by(history.getUpdated_by());
            existingHistory.setRemarks(history.getRemarks());
            existingHistory.setUpdated_at(history.getUpdated_at());
            return complaintHistoryRepository.save(existingHistory);
        }
        return null;
    }
    public void deleteHistory(Integer id) {
        complaintHistoryRepository.deleteById(id);
    }
}