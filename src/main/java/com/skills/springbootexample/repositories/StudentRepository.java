package com.skills.springbootexample.repositories;

import com.skills.springbootexample.DTO.Student;
import com.skills.springbootexample.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    StudentEntity getStudentById(Long id);

    StudentEntity findStudentById(Long id);


}
