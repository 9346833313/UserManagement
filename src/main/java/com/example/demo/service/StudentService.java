package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;     
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}
    public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
    	
    }
    public Student createStudent(Student student) {
		return studentRepository.save(student);
		
    	
    }
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).get();
        student.setName(studentDetails.getName());
        student.setBranch(studentDetails.getBranch());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    	
    }



