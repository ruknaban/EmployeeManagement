package com.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

public interface EmployeeService<Employee> {
	 List<Employee> getAllEmployees();
	    void saveEmployee(Employee employee);
	    Employee getEmployeeById(Long id);
	    void deleteEmployeeById(Long id);
	    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
		void saveEmployee(com.comprehense.employee.Employee employee);

}
