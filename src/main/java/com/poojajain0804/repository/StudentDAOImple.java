package com.poojajain0804.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.poojajain0804.model.Student;


@Repository
public class StudentDAOImple implements StudentDAO {

	private static Map<Integer, Student> repo= new ConcurrentHashMap<Integer,Student>();
	
	
	public void save(Student s) {
		repo.put(s.getRollNum(), s);
		
	}

	public void update(Student s) {
		if (null!=repo.get(s.getRollNum())){
			repo.remove(s.getRollNum());
			repo.put(s.getRollNum(), s);
		}
		else{
			new RuntimeException("No Student with this roll number !!!");
		}
	}

	public void delete(int rollNumber) {
		if (null!=repo.get(rollNumber)){
			repo.remove(rollNumber);
		}
		else
		{
			System.out.println("No record Exists");
		}
		
	}

	public Student get(int rollNumber) {
		return repo.get(rollNumber);
	}

	public List<Student> listOfStudent() {
		return new ArrayList<Student>(repo.values());
	}

}
