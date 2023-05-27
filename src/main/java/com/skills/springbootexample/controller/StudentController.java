package com.skills.springbootexample.controller;


import com.skills.springbootexample.DTO.Student;
import com.skills.springbootexample.entities.StudentEntity;
import com.skills.springbootexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public StudentEntity createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
     @GetMapping("/students")
    public List<StudentEntity> getStudents() {
         return studentService.getStudents();
     }

}


