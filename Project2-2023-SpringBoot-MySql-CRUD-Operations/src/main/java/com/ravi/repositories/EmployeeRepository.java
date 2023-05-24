package com.ravi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
