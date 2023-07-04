package com.sreeramtraders.cruddemo.dao;

import com.sreeramtraders.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(int id);

    List<Student> findAll();
}
