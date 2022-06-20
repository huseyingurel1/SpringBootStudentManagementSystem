package com.huseyingurel.studentmanagementsystem;

import com.huseyingurel.studentmanagementsystem.entity.Student;
import com.huseyingurel.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Huseyin","Gurel", "huseyingurel@gmail.com");
//        studentRepository.save(student1);
//        Student student2 = new Student("Isa","Kayabasi", "isakayabasi@gmail.com");
//        studentRepository.save(student2);
//        Student student3 = new Student("Furkan","Sahan", "furkansahan@gmail.com");
//        studentRepository.save(student3);
//        Student student4 = new Student("Erdem","Yılmaz", "erdemyılmaz@gmail.com");
//        studentRepository.save(student4);




    }


}
