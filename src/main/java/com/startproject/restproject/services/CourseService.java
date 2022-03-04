package com.startproject.restproject.services;

import java.util.List;

import com.startproject.restproject.entity.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
}
