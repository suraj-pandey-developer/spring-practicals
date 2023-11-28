package com.mapping.onetooneunidirectional.repository;

import com.mapping.onetooneunidirectional.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
