package com.demo.springboot.service;

import java.util.List;

import com.demo.springboot.entities.Course;

public interface CourseService 
{
	public List<Course> getCourse();

	public Course getCourses(long courseId);

	public Course addCourse(Course course);
	

}
