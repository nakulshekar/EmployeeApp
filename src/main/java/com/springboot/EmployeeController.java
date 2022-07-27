package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public MessageResponse addEmployee(@RequestBody Employee employeeRequest) throws ResourceExistsException 
	{
		return service.create(employeeRequest);
	}
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee>employees=service.getAll();
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.GET,value="/find/{id}")
	public ResponseEntity<Employee>getEmployeebyId(@PathVariable("id")Integer id)
	{
		Employee employee= service.single(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/update/{id}/{salary}")
	public Employee update(@PathVariable("id")Integer id, @PathVariable("salary")double salary) throws  ResourceNotFoundException
	{
		 
		 return service.update(id, salary);
	}	
	
}
