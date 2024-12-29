package com.rajneet.springboot.hibernate.service;

import com.rajneet.springboot.hibernate.model.Department;
import com.rajneet.springboot.hibernate.repo.DepartmentRepo;
import com.rajneet.springboot.hibernate.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    // Add a new department with employees
    public Department addDepartmentWithEmployees(Department department) {
        return departmentRepo.save(department);
    }

    // Fetch a department by id
    public Department getDepartmentById(Long id) {
        return departmentRepo.findById(id).orElse(null);
    }

    // Fetch all departments
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }


}
