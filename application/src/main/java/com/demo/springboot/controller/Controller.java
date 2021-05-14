package com.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.entities.Course;
import com.demo.springboot.service.CourseService;

@RestController
//@RequestMapping("/rest")
public class Controller 
{
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "This is Home page where we can control it";
	}
	
	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourse()
	{
		return this.courseservice.getCourse();
	}
	
	@GetMapping("/{courseId}")
	public Course getCourses(@PathVariable("courseId") String courseId)
	{
		return this.courseservice.getCourses(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseservice.addCourse(course);
		
	}
}
