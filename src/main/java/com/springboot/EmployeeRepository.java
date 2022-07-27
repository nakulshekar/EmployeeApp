package com.springboot;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {




}
