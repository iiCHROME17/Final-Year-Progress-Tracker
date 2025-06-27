package com.jbb90.fypt;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository; // Injected repository for Student entity

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository; // Constructor injection of the repository
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll(); // Fetch all students from the repository
    }
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null); // Fetch a student by ID, return null if not found
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student); // Save a student entity to the repository
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id); // Delete a student by ID from the repository
    }

}
