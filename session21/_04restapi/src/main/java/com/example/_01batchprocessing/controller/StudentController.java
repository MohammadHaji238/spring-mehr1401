package com.example._01batchprocessing.controller;

import com.example._01batchprocessing.mode.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {


    @GetMapping("students")
    public List<Student> getStudents()
    {
        return Arrays.asList(
                new Student(1l,"neda","neda","eee@gmail.com"),
                new Student(2l,"reza","neda","eee@gmail.com")

        );
    }

}
