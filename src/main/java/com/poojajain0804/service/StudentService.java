package com.poojajain0804.service;

import java.util.List;

import com.poojajain0804.model.Student;

public interface StudentService {
	
	void save(Student student);
	Student get(int rollNumber);
	List<Student> getAll();
	void delete(int rollNumber);
	void update(Student student);

}
