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

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        StudentEntity studentEntity = studentService.createStudent(student);
        return new ResponseEntity<>(studentEntity, HttpStatus.CREATED);
    }


     //available students
    @GetMapping("/students")
    public ResponseEntity<?> availableStudets(){
        List<StudentEntity> allData = studentService.getStudents();
        return  new ResponseEntity<>(allData, HttpStatus.OK);
    }

    //get one student
    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Long id){
        StudentEntity singleStudent = studentService.getStudent(id);
        return new ResponseEntity<>(singleStudent , HttpStatus.OK);
    }

    //update a record
    @PutMapping("/student/{id}")
    public ResponseEntity<?> replaceStudent(@PathVariable Long id,@RequestBody Student student){
        StudentEntity singleStudent = studentService.updateStudent(id , student);

        return new ResponseEntity<>(singleStudent, HttpStatus.OK);
    }


}


