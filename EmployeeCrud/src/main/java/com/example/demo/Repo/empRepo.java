package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employee;

public interface empRepo extends JpaRepository<Employee, Integer> {

}
