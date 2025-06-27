package com.jbb90.fypt;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
/**
 * Entity representing a student in the FYP Tracker system.
 * Stores personal information, login credentials, and project name.
 */
@Entity
public class Student {
    /** Unique identifier for the student (auto-generated). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //This is the primary key for the Student entity
    /** Name of the student. */
    private String name; // Name of the student
    /** Email address of the student. */
    private String email; // The student's email address
    /** Password for student login. */
    private String password; // The student's password
    /** Name of the student's project. */
    private String projectName; // Name of the student's project

    /**
     * Default constructor required by JPA.
     */
    public Student() {}

    /**
     * Constructs a new Student with the given details.
     * @param name the student's name
     * @param email the student's email
     * @param password the student's password
     * @param projectName the student's project name
     */
    public Student(String name, String email, String password, String projectName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.projectName = projectName;
    }

    /** @return the student ID */
    public Long getId() { return id; }
    /** @param id the student ID */
    public void setId(Long id) { this.id = id; }
    /** @return the student's name */
    public String getName() { return name; }
    /** @param name the student's name */
    public void setName(String name) { this.name = name; }
    /** @return the student's email */
    public String getEmail() { return email; }
    /** @param email the student's email */
    public void setEmail(String email) { this.email = email; }
    /** @return the student's password */
    public String getPassword() { return password; }
    /** @param password the student's password */
    public void setPassword(String password) { this.password = password; }
    /** @return the student's project name */
    public String getProjectName() { return projectName; }
    /** @param projectName the student's project name */
    public void setProjectName(String projectName) { this.projectName = projectName; }

} 