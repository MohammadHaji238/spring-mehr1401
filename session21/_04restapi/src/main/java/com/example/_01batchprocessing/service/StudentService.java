package com.example._01batchprocessing.service;

import com.example._01batchprocessing.mode.Student;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    List<Student> list;

    public List<Student> restCallStudents()
    {
        RestTemplate restTemplate=new RestTemplate();
        Student[] students = restTemplate.getForObject("http://localhost:8080/students", Student[].class);


        list=new ArrayList<>();

        for (Student st:students)
        {
            list.add(st);
        }
        return list;
    }


    public Student getStudent()
    {
        if (list==null)
            restCallStudents();
        if (list!=null&& !list.isEmpty())
            return list.remove(0);

        return null;
    }
}
