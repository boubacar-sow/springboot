package com.springboot.springbootproject.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.springbootproject.model.Employee;
import com.springboot.springbootproject.repository.EmployeeRepository;
import com.springboot.springbootproject.service.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
