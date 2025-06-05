package com.example.enrollmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {

    private String id;
    private String studentName;
    private String courseId;
    private String batchId;

}
