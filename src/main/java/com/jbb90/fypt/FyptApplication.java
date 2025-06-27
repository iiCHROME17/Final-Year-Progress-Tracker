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

	private static void CLIDisplayAdminCredentials(Student admin) {
		System.out.println("Admin credentials:");
		System.out.println("Boilerplate Email: " + admin.getEmail());
		System.out.println("Boilerplate Password: " + admin.getPassword());
	}

	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository) {
		return (args) -> {
			Student defaultStudent = new Student("admin","df@example.com",
			"admin111","Default Project");
			studentRepository.save(defaultStudent);

			// Create and save a student - me
			Student s = new Student("Jerome", "wc003059@student.reading.ac.uk", 
			"adminPassword335", "FYP Tracker");
			studentRepository.save(s);

			CLIDisplayAdminCredentials(defaultStudent);
		};
	}
}
