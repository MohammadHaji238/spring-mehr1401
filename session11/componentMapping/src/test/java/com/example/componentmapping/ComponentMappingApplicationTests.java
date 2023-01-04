package com.example.componentmapping;

import com.example.componentmapping.entity.Address;
import com.example.componentmapping.entity.Student;
import com.example.componentmapping.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentMappingApplicationTests {
    @Autowired
    private StudentRepository  repository;

    @Test
    void contextLoads() {
    }

    @Test
    void createStudent() {
        Student student=new Student();
        student.setName("mahsa rahimi");
        Address address=new Address();
        address.setCity("tehran");
        address.setCountry("iran");
        address.setStreet("valiasr");
        student.setAddress(address);

        repository.save(student);
    }

}
