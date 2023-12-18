package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeDtoService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeDtoService empService;
	
	@PostMapping("/employees")
	public EmployeeDto addUser(@RequestBody  EmployeeDto empDto)
	{
		return empService.createEmployee(empDto);
		
	}
	
	@GetMapping("employees/{Id}")
	public EmployeeDto getUserById( @PathVariable("Id") long empId) {
		return empService.getEmployeeById(empId);
	}
}
