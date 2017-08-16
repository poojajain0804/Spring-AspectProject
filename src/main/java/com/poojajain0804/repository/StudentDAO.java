package com.poojajain0804.repository;

import java.util.List;

import com.poojajain0804.model.Student;

public interface StudentDAO {

	public void save(Student s);
	public void update(Student s);
	public void delete(int rollNumber);
	Student get(int rollNumber);
	List<Student> listOfStudent();
}
