package com.sccgms.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sccgms.entity.ComplaintHistory;
import com.sccgms.service.ComplaintHistoryService;
@RestController
@RequestMapping("/api/history")
public class ComplaintHistoryController {
    private final ComplaintHistoryService complaintHistoryService;

    public ComplaintHistoryController(
            ComplaintHistoryService complaintHistoryService) {
        this.complaintHistoryService = complaintHistoryService;
    }
    @GetMapping
    public List<ComplaintHistory> getAllHistory() {
        return complaintHistoryService.getAllHistory();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ComplaintHistory> getHistoryById(
          @PathVariable Integer id) {
        ComplaintHistory history =
                complaintHistoryService.getHistoryById(id);
        if (history != null) {
            return ResponseEntity.ok(history);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    public ComplaintHistory createHistory(
            @RequestBody ComplaintHistory history) {
        return complaintHistoryService.saveHistory(history);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ComplaintHistory> updateHistory(
            @PathVariable Integer id,
            @RequestBody ComplaintHistory history) {
        ComplaintHistory updatedHistory =
                complaintHistoryService.updateHistory(id, history);
        if (updatedHistory != null) {
            return ResponseEntity.ok(updatedHistory);
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHistory(
            @PathVariable Integer id) {

        complaintHistoryService.deleteHistory(id);

        return ResponseEntity.ok("Complaint history deleted successfully");
    }
}