package com.rajneet.springboot.hibernate.repo;

import com.rajneet.springboot.hibernate.model.Department;
import com.rajneet.springboot.hibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
