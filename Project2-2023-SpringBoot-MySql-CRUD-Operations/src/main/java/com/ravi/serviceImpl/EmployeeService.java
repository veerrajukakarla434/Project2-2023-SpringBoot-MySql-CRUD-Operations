package com.ravi.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.entities.Employee;
import com.ravi.repositories.EmployeeRepository;
import com.ravi.service.IEmployeeService;


@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	

	@Override
	public void createEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
    
	@Override
	public Optional<Employee> getEmployeeById(long id) {
		Optional<Employee> employee = null;
		employee = employeeRepository.findById(id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}
    
	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.deleteById(id);
	}

}
