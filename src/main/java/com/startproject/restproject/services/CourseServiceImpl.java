package com.startproject.restproject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.startproject.restproject.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list ;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123, "Java Core", "Basic java course"));
		list.add(new Course(423, "Spring boot", "CPA Basic java course"));

	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course: list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

}
