package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public Optional<Employee> getEmployee(int id){
		return repository.findById(id);
	}
	public String updateDetails(Employee emp) {
		repository.save(emp);
		return "updated";
	}
	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "Id deleted";
	}
}
