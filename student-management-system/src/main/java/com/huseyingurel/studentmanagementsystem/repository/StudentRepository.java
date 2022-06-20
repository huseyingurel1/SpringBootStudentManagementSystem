package com.huseyingurel.studentmanagementsystem.repository;


import com.huseyingurel.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
 



public interface StudentRepository extends JpaRepository<Student, Long > {
}
