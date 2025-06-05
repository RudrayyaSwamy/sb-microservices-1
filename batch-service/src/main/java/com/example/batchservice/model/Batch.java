package com.example.batchservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Batch {

    private String id;
    private String courseId;
    private String schedule;
}
