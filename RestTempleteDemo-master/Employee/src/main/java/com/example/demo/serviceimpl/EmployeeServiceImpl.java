package com.example.demo.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.modelmapper.UserMapper;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeDtoService;
@Service
public class EmployeeServiceImpl implements EmployeeDtoService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ModelMapper userMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		
		// convert dto to entity
		Employee employee=UserMapper.mapToEmployee(employeeDto);
		Employee savedEmployee=empRepo.save(employee);
		// convert entity to dto
		//EmployeeDto empDto=userMapper.map(savedEmployee, EmployeeDto.class);
		EmployeeDto empDto=UserMapper.mapToEmployeeDto(empRepo.save(employee));
		
		return empDto;
	}
	
	@Override
	public EmployeeDto getEmployeeById(long id) {	
		Employee emp=empRepo.findById(id).get();
		EmployeeDto empDto=UserMapper.mapToEmployeeDto(emp);
		AddressDto addDto=restTemplate.getForObject("http://localhost:8080/api/address/"+empDto.getEmpId(), AddressDto.class); 
		empDto.setAddressdto(addDto);
		return empDto;
	}

}
