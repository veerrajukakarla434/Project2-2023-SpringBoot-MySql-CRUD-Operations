package com.ravi.service;

import java.util.Optional;

import com.ravi.entities.Employee;

public interface IEmployeeService {

	
	public void createEmployee(Employee emp);

	public Optional<Employee> getEmployeeById(long id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(long id);


}
