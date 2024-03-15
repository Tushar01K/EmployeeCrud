package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.empRepo;

@Service
public class empSer {
	
@Autowired
empRepo emprepo;


public Employee saveemp(Employee emp) {
	return emprepo.save(emp);
	
}


public List<Employee> findAll(Employee emp) {
	return emprepo.findAll();
	
}


public void deleteById(int id) {
	emprepo.deleteById(id);

}


public Optional<Employee> findById(int id) {
	return emprepo.findById(id);
	
}


public Employee Addemp(Employee emp) {
	
	return emprepo.save(emp);
}






}
