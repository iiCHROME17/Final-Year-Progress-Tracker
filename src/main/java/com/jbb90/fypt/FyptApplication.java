package com.jbb90.fypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FyptApplication {

	public static void main(String[] args) {
		SpringApplication.run(FyptApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository) {
		return (args) -> {
			// Create and save a student - me
			Student s = new Student("Jerome", "wc003059@student.reading.ac.uk", 
			"adminPassword335", "FYP Tracker");
			studentRepository.save(s);

			Student defaultStudent = new Student("admin","df@example.com",
			"admin111","Default Project");
			studentRepository.save(defaultStudent);

			// Print all student names and project names
			studentRepository.findAll().forEach(student -> System.out.println(student.getName() + " - " + student.getProjectName()));
		};
	}
}
