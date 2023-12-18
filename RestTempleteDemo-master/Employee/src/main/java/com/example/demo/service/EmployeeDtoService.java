package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeDtoService {

	EmployeeDto createEmployee( EmployeeDto  employeeDto);
	 EmployeeDto getEmployeeById(long id);
}
