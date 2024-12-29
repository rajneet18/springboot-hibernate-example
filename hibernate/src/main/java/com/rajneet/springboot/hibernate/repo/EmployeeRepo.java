package com.rajneet.springboot.hibernate.repo;

import com.rajneet.springboot.hibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
