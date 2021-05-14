package com.demo.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.springboot.entities.Course;
@Service
public class CourseServiceImpl implements CourseService 
{
	
	
	List<Course> list;
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(111,"Core java Course","this  course contains basics of java"));
		list.add(new Course(222,"Core python Course","this  course contains basics of python"));
		list.add(new Course(5124,"SpringBoot Course","this  course contains basics of SpringBoot"));
	}

	@Override
	public List<Course> getCourse() {
		
		return list;
	}
	@Override
	
	public Course getCourses(long courseId)
	{
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) 
	{
		list.add(course);
		return course;
	}

}
