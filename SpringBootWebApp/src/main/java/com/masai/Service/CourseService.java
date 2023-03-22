package com.masai.Service;

import java.util.List;

import com.masai.Entity.Course;

public interface CourseService {
	public List<Course>getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	

}
