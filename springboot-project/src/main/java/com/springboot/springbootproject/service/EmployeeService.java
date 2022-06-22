package com.springboot.springbootproject.service;

import java.util.List;

import com.springboot.springbootproject.model.*;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
}
