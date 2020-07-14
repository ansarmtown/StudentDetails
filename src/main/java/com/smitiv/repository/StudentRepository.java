package com.smitiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smitiv.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
