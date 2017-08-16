package com.poojajain0804.aop;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poojajain0804.model.Student;
import com.poojajain0804.service.StudentService;

public class SpringAspectProjectApplication {

	public static AbstractApplicationContext objAbstractApplicationContext;
	
	static {
		objAbstractApplicationContext= new ClassPathXmlApplicationContext("application-context.xml");
	}
	public static void main(String[] args) {
		System.out.println("lets get started");
		StudentService studentService=objAbstractApplicationContext.getBean(StudentService.class,"studentService");
		
		Student s1=new Student ("Pooja","MCA",1,Arrays.asList("CS","english"));
		Student s2=new Student ("Amit","Civil",2,Arrays.asList("maths","DS"));
		Student s3=new Student ("Neha","MCom",3,Arrays.asList("Comm","Eco"));
		studentService.save(s1);
		studentService.save(s2);
		studentService.save(s3);
		
		for (Student s:studentService.getAll()){
			System.out.println(s);
		}
		shutDown();
		System.out.println("I am finish now.");
	}
	public static void shutDown(){
		objAbstractApplicationContext.registerShutdownHook();
	}
}

