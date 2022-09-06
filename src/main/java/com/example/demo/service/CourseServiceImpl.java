package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course get(String id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course update(String id, Course course) {
        Course storedCourse = get(id);
        storedCourse.setCourseName(course.getCourseName());
        storedCourse.setHours(course.getHours());

        return courseRepository.save(storedCourse);
    }

    @Override
    public void delete(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
