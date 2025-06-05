package com.example.batchservice.controller;


import com.example.batchservice.model.Batch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/batches")
public class BatchController {

    private static final List<Batch> batches = Arrays.asList(
            new Batch("B201", "C101", "Mon-Wed-Fri 6PM"),
            new Batch("B202", "C102", "Tue-Thu 7PM")
    );

    @GetMapping
    public List<Batch> getAll() {
        return batches;
    }

    @GetMapping("/{id}")
    public Batch getById(@PathVariable String id) {
        return batches.stream().filter(b -> b.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }
}