package com.smitiv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name =  "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name = "studentId")
	private long id ;
	@Column(name = "registerno")
	private String registerno;
	@Column(name = "name")
	private String name ;
	@Column(name = "std")
	private String std;
	public Student() {
		super();
	}
	public Student(long id, String registerno, String name, String std) {
		super();
		this.id = id;
		this.registerno = registerno;
		this.name = name;
		this.std = std;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegisterno() {
		return registerno;
	}
	public void setRegisterno(String registerno) {
		this.registerno = registerno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", registerno=" + registerno + ", name=" + name + ", std=" + std + "]";
	}
	

	
	
	

}
