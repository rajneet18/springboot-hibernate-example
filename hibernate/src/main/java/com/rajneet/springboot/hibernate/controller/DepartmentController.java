package com.rajneet.springboot.hibernate.controller;

import com.rajneet.springboot.hibernate.model.Department;
import com.rajneet.springboot.hibernate.model.Employee;
import com.rajneet.springboot.hibernate.service.DepartmentService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private  DepartmentService departmentService;

    @PostMapping
    public Department createDepartment(@RequestBody Department department){
       return  departmentService.addDepartmentWithEmployees(department);

    }

    // Get all departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    // Get a department by ID
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    // Method to be executed after bean initialization
    @PostConstruct
    public void init() {
        // Create Department
        Department department = new Department("HR");

// Create Employees
        Employee employee1 = new Employee("Alice", department);
        Employee employee2 = new Employee("Bob", department);

// Add Employees to Department
        department.setEmployees(List.of(employee1, employee2));

// Save the department (this will save the employees too due to cascade)
        departmentService.addDepartmentWithEmployees(department);
    }

}
