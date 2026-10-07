package com.sccgms.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sccgms.entity.Department;
import com.sccgms.repository.DepartmentRepository;
@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public Department updateDepartment(Integer id, Department department) {
        Department existingDepartment =
                departmentRepository.findById(id).orElse(null);
        if (existingDepartment != null) {
            existingDepartment.setDepartment_name(
                    department.getDepartment_name());
            return departmentRepository.save(existingDepartment);
        }
        return null;
    }
    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}