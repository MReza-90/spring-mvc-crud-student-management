package com.code2go.spring_mvc_crud.dao;

import com.code2go.spring_mvc_crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    //add a method to sort the students by their lastname
    public List<Student> findAllByOrderByLastNameAsc();
}
