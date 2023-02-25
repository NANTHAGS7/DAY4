package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Services.EmployeeService;

@RestController
public class ApiController {
	@Autowired
	EmployeeRepository serviceRepository;
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/getty")
	List<Employee> getList(){
		return serviceRepository.findAll();
	}
	@PutMapping("/update")
	public String update(@RequestBody Employee emp) {
		return service.updateDetails(emp);
}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
	return service.deleteDetails(id);
}
}
