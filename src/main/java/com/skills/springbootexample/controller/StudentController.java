package com.skills.springbootexample.controller;


import com.skills.springbootexample.DTO.Student;
import com.skills.springbootexample.entities.StudentEntity;
import com.skills.springbootexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public StudentEntity createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

     //availabble students
    @GetMapping("/students")
    public ResponseEntity<?> availableStudets(){
        Map<String , Object> studentData = new HashMap<>();
        List<StudentEntity> allData = studentService.findAll();
        studentData.put("data" , allData );
        return  new ResponseEntity<>(studentData, HttpStatus.ACCEPTED);
    }

}


