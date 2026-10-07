package com.sccgms.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sccgms.entity.Assignment;
import com.sccgms.repository.AssignmentRepository;
@Service
public class AssignmentService {
    private final AssignmentRepository assignmentRepository;
    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }
    public Assignment getAssignmentById(Integer id) {
        return assignmentRepository.findById(id).orElse(null);
    }
    public Assignment saveAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }
    public Assignment updateAssignment(Integer id, Assignment assignment) {
        Assignment existingAssignment =
                assignmentRepository.findById(id).orElse(null);
        if (existingAssignment != null) {
            existingAssignment.setComplaint_id(
                    assignment.getComplaint_id());
            existingAssignment.setStaff_id(
                    assignment.getStaff_id());
            existingAssignment.setDepartment_id(
                    assignment.getDepartment_id());
            existingAssignment.setAssigned_at(
                    assignment.getAssigned_at());

            return assignmentRepository.save(existingAssignment);
        }
        return null;
    }
    public void deleteAssignment(Integer id) {
        assignmentRepository.deleteById(id);
    }
}