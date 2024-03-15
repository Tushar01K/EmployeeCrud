package com.example.demo.Controleer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.empSer;

@RestController
public class empCotroller {
	@Autowired
	empSer empser;
	
	@PostMapping("save")
	public Employee saveEmp( @RequestBody Employee emp) {
		System.out.println(emp);
		return empser.saveemp(emp);
		
	}
	
	@GetMapping("get")
	
	public List<Employee> findAll(Employee emp){
		return empser.findAll(emp);
		
	}
	
	@DeleteMapping("delete{id}")

	public void delete(@PathVariable int id) {
	
		empser.deleteById(id);
	}
	
	@GetMapping("find{id}")
	public Optional<Employee> FindById(@PathVariable int id) {
		return empser.findById(id);
		
		
	}
	
	@PutMapping("add")
	public Employee AddEmp(@RequestBody Employee emp) {
		return empser.Addemp(emp);
		
		
		
	}

}
