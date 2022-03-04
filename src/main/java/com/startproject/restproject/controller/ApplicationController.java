package com.startproject.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.startproject.restproject.entity.Course;
import com.startproject.restproject.services.CourseService;

@RestController
public class ApplicationController {
	
	@Autowired
	private CourseService cs;

	@GetMapping("/home")
	public String home() {
		return "This is home page LOCAL DEMO";
	}
	
	// Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.cs.getCourses();
	}
	
	// Get the course based on ID
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	
	// Get the course based on ID
		@GetMapping("/courses/{courseId}")
		public Course getLCourse(@PathVariable String courseId) {
			return this.cs.getCourse(Long.parseLong(courseId));
		}
}
