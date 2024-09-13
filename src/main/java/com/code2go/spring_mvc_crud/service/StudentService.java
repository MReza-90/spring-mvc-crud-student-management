package com.code2go.spring_mvc_crud.service;

import com.code2go.spring_mvc_crud.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(int theId);

    Student save(Student theStudent);

    void deleteById(int theId);
}
