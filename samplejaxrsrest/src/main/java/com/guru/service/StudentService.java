package com.guru.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guru.bean.Student;

@Service
public class StudentService {
	List<Student> students = new ArrayList<>();

	public List<Student> getAllStudents() {

		Student s1 = new Student(10, "ramu", "bang");
		Student s2 = new Student(11, "guru", "kadapa");
		Student s3 = new Student(12, "narasa", "bang");
		Student s4 = new Student(13, "sreenu", "hyd");
		Student s5 = new Student(14, "nagaraju", "pune");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		return students;
	}

	public void saveData(Student data) {
		students.add(data);
	}

}
