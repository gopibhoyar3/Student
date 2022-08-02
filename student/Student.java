package com.gopibhoyar.springboot.student;

import java.time.LocalDate;

public class Student {
	
	private long id;
	private String name, email;
	private LocalDate dob;
	private Integer age;
	
	public Student() {
		super();
	}
	
	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public Student(long id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}
	
	

}
