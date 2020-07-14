package com.smitiv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smitiv.entity.Student;
import com.smitiv.service.StudentService;

import net.bytebuddy.asm.Advice.Return;

@RestController

public class StudentController {
	
	@Autowired
	StudentService ser;
	
@GetMapping("/student")

public List<Student> getStudents()
{
	return ser.getAll();
	
}

@GetMapping("/student/{id}")

public Student getOne(@PathVariable("id") long id)
{
	return ser.getOne(id);
}

@PostMapping("/student")

public List<Student> Add(@RequestBody Student s)
{
	ser.add(s);
	return ser.getAll();
}

@PutMapping("/student/{id}")
public List<Student> edit(@RequestBody Student s)
{
	ser.edit(s);
	return ser.getAll();
}

@DeleteMapping("/student/{id}")
public List<Student> Delete(@PathVariable("id") long id)
{
	 ser.delete(id);
	 return ser.getAll();
	
}
}
