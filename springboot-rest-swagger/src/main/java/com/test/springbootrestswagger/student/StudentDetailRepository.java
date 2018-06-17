package com.test.springbootrestswagger.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentDetailRepository {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	/*public void setStudents() {
		
		
	}*/
	
public List<Student> sStudents() {
		
	Student student= new Student();
	List<Student> studentList = new ArrayList<Student>();
	
	student.setId(new Long(10));
	student.setName("test");
	student.setPassportNumber("S1234");
	studentList.add(student);
	student.setId(new Long(20));
	student.setName("test2");
	student.setPassportNumber("S123422");
	studentList.add(student);
	
	
	// studentRepository.saveAll(studentList);
	 //studentRepository.flush();

		return studentList ;
	}

}
