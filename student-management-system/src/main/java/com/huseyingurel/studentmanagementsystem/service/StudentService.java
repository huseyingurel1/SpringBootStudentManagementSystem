package com.huseyingurel.studentmanagementsystem.service;

import com.huseyingurel.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List< Student > getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
