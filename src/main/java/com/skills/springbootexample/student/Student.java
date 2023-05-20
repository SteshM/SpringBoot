 package com.skills.springbootexample.student;

import java.time.LocalDate;

public class Student {
    public Long id;
    public String name;
    public String email;
    public LocalDate dob;
    public Integer age;

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
