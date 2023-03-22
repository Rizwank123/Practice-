package com.masai.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masai.Entity.Course;
@Service
public class CourseServiceImpl  implements CourseService{
	List<Course>list;
	
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(123,"Java Spring MVC","Creating  Api"));
		list.add(new Course(124,"Core Java","Creating  Desktop Application"));
		list.add(new Course(125,"Python Django","Backend Techology"));
	}


	@Override
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
