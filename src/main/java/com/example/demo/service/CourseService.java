package com.example.demo.service;

import com.example.demo.model.Course;

import java.util.List;

public interface CourseService {

    Course get(String id);

    Course save(Course course);

    Course update(String id, Course course);

    void delete(Course course);

    List<Course> list();
}
