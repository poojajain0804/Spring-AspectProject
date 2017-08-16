package com.poojajain0804.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poojajain0804.model.Student;
import com.poojajain0804.repository.StudentDAO;

/**
 * @author temp
 *
 */
@Service
public class StudentServicesImple implements StudentService {

	@Autowired
	private StudentDAO objStudentDAO;

	public StudentDAO getObjStudentDAO() {
		return objStudentDAO;
	}

	public void setObjStudentDAO(StudentDAO objStudentDAO) {
		this.objStudentDAO = objStudentDAO;
	}

	/* (non-Javadoc)
	 * @see com.poojajain0804.service.StudentService#save(com.poojajain0804.model.Student)
	 */
	public void save(Student student) {
		objStudentDAO.save(student);
	}

	/* (non-Javadoc)
	 * @see com.poojajain0804.service.StudentService#get(int)
	 */
	public Student get(int rollNumber) {
		return objStudentDAO.get(rollNumber);
	}

	public List<Student> getAll() {
		return objStudentDAO.listOfStudent();
	}

	public void delete(int rollNumber) {
		objStudentDAO.delete(rollNumber);
	}

	//
	public void update(Student student) {
		objStudentDAO.update(student);
	}

}
