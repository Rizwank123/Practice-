package com.masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Student;
import com.masai.Entity.Course;
import com.masai.Service.CourseService;


@RestController
public class MyController {
	@RequestMapping("/")
	public String  SayHello() {
		return "index.html";
		
	}
//	@RequestMapping("/student")
//	public List<Student> student() {
//		List<Student>st=new ArrayList<>();
//		
//		 st.add(new Student(2, "Hacker", 720));
//		 st.add(new Student(3, "Rizwan", 700));
//		 st.add(new Student(4, "Arhan", 620));
//		 st.add(new Student(5, "Tabraz", 520));
//		 return st;
//				
//		
//	}
	//get courses
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return courseService.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCouse(@PathVariable String courseId) {
		return courseService.getCourse(Long.parseLong(courseId));
		
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
	}

	}
