package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comprehense.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
