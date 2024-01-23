package com.example.demo.student;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
	public List<Student> getStudents(){
		return List.of(
						new Student(
							1L,
							"Martin",
							40
						)
		);
	}
}