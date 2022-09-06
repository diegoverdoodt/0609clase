package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/courses")
    public List<Course> list() {
        return courseService.list();
    }


    @GetMapping("/courses/{id}")
    public Course get(@PathVariable String id) {
        return courseService.get(id);
    }

    @PostMapping("/courses")
    public Course create(@RequestBody Course course) {
        return courseService.save(course);
    }

    @PutMapping("/courses/{id}")
    public Course update(@PathVariable String id, @RequestBody Course course) {
        Course storedCourse = courseService.get(id);
        storedCourse.setCourseName(course.getCourseName());
        storedCourse.setHours(course.getHours());

        return courseService.save(storedCourse);
    }


    @DeleteMapping("/courses/{id}")
    public void delete(@PathVariable String id) {
        Course course = courseService.get(id);
        courseService.delete(course);
    }

}
