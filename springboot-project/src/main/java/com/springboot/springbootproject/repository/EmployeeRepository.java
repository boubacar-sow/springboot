package com.springboot.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
