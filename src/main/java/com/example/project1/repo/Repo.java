package com.example.project1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.model.Employee;

public interface Repo extends JpaRepository<Employee, Integer> {

}
