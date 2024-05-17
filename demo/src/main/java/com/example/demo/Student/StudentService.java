package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "pranav@gmail.com",
                        LocalDate.of(2001, Month.DECEMBER,30),
                        30
                )
        );
    }
}
