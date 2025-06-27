package com.jbb90.fypt;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students") // Controller for handling student-related requests
public class StudentController {
    private final StudentService studentService; // Injected service for Student entity

    public StudentController(StudentService studentService) {
        this.studentService = studentService; // Constructor injection of the service
    }

    @GetMapping // Endpoint to get all students
    public List<Student> getAllStudents() {
        return studentService.getAllStudents(); // Fetch and return all students
    }

    @PostMapping // Endpoint to create a new student
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student); // Save and return the newly created student
    }


}
