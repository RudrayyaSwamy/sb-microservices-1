package com.example.courseservice.controller;

import com.example.courseservice.model.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private static final List<Course> courses = Arrays.asList(
            new Course("C101", "Java Basics", "Learn Java from scratch", "John Doe"),
            new Course("C102", "Spring Boot", "Build REST APIs with Spring Boot", "Jane Smith"),
            new Course("C103", "Angular Basics", "Frontend with Angular", "Rahul Verma")
    );

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable String id) {
        return courses.stream()
                .filter(course -> course.getId().equalsIgnoreCase(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
