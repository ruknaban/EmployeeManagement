package com.comprehense.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Page;

@Entity
@Table(name="employees")
public class Employee {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @Column(name = "first_name")
	    private String firstName;
	    @Column(name = "last_name")
	    private String lastName;
	    @Column(name = "salary")
	    private String salary;
	    @Column(name = "designation")
	    private String designation;

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public void saveEmployee(Employee employee) {
			
		}

		public Employee getEmployeeById(Long id2) {
			return null;
		}

		public void deleteEmployeeById(Long id2) {
			
		}

		public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDir) {
			return null;
		}
		
}	
