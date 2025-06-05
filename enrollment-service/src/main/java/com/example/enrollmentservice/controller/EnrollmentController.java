package com.example.enrollmentservice.controller;

import com.example.enrollmentservice.model.Enrollment;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private static final List<Enrollment> enrollments = new ArrayList<>(List.of(
            new Enrollment("E301", "Alice", "C101", "B201"),
            new Enrollment("E302", "Bob", "C102", "B202")
    ));

    @GetMapping
    public List<Enrollment> getAll() {
        return enrollments;
    }

    @PostMapping
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        enrollments.add(enrollment);
        return enrollment;
    }
}
