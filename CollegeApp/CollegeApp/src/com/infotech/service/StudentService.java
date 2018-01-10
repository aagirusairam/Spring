package com.infotech.service;

import java.util.List;

import com.infotech.model.Student;

public interface StudentService {
	public abstract Student validateStudentCredential(String email,	String password);
	public abstract boolean registerStudent(Student student);
	public  List<Student> listStudents();


}