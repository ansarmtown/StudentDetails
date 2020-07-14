package com.smitiv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smitiv.entity.Student;
import com.smitiv.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studrepo;
	
	public List<Student> getAll()
	{
		return studrepo.findAll();
	}
	public Student getOne( long id)
	{
		return studrepo.findById(id).get();
	}
	
	public void edit(Student s)
	{
		Student student = studrepo.findById(s.getId()).get();
		student.setName(s.getName());
		student.setRegisterno(s.getRegisterno());
		student.setStd(s.getStd());
		studrepo.save(student);
	
		
	}
	public void delete(long id)
	{
		studrepo.deleteById(id);
	}
	public void add(Student s) {
		studrepo.save(s);		
	}

}
