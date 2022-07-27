package com.springboot;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeService {
@Autowired
private EmployeeRepository repo;
public MessageResponse create(Employee employeeRequest)throws ResourceExistsException
{
	Optional<Employee>employee=repo.findById(employeeRequest.getId());
	 if(employee.isPresent())
	 {
		 throw new ResourceExistsException("Employee already exists in the database!"); 
	 }
	 else
	 {
	
	employeeRequest.setId(employeeRequest.getId());
	employeeRequest.setName(employeeRequest.getName());
	employeeRequest.setSalary(employeeRequest.getSalary());
	employeeRequest.setDesignation(employeeRequest.getDesignation());
	repo.save(employeeRequest);
	return new MessageResponse("Employee created!");
	 }
}

public Employee update(Integer id,double salary)throws ResourceNotFoundException
{
      Optional<Employee>employee=repo.findById(id);
      if(employee.isPresent())
      {
    	  Employee obj = employee.get();
      	
      	 obj.setSalary(salary);
    
      	  repo.save(obj);
          return obj;
    	  
      }
      else
      {
    	  throw new ResourceNotFoundException("Employee does not exist in the database!");
    	 
    	
    	
      }
}

public Employee single(Integer id)
{
	return repo.findById(id).get();
}

public List<Employee> getAll()
{
	List<Employee>list=repo.findAll();
	 list.sort(Comparator.comparing(Employee::getSalary).thenComparing(new NameInAscendingOrder()).reversed());

	 
	 return list;
	
}
}


