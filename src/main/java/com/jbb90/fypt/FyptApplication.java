package com.jbb90.fypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/**
 * Main entry point for the FYP Tracker Spring Boot application.
 * Sets up default admin credentials for both student and advisor and displays them in the console.
 */
@SpringBootApplication
public class FyptApplication {

	/**
	 * Starts the Spring Boot application.
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(FyptApplication.class, args);
	}

	/**
	 * Prints the default admin credentials for student and advisor to the console.
	 * @param admin the default student admin
	 * @param advisor the default advisor admin
	 */
	private static void CLIDisplayAdminCredentials(Student admin, Advisor advisor) {
		System.out.println("Student Admin credentials:");
		System.out.println("Boilerplate Email: " + admin.getEmail());
		System.out.println("Boilerplate Password: " + admin.getPassword());

		System.out.println("Advisor Admin credentials:");
		System.out.println("Boilerplate Email: " + advisor.getEmail());
		System.out.println("Boilerplate Password: " + advisor.getPassword());
	}

	/**
	 * CommandLineRunner bean to set up default admin users and display their credentials at startup.
	 * @param studentRepository repository for student entities
	 * @param advisorRepository repository for advisor entities
	 * @return a CommandLineRunner that seeds the database and prints credentials
	 */
	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository, AdvisorRepository advisorRepository) {
		return (args) -> {
			// An admin student with default credentials
			Student defaultStudent = new Student("admin","df@example.com",
			"admin111","Default Project");
			studentRepository.save(defaultStudent);

			// An admin advisor with default credentials
			Advisor defaultAdvisor = new Advisor("admin2","a2@etc.com",
			"admin123");
			advisorRepository.save(defaultAdvisor);

			CLIDisplayAdminCredentials(defaultStudent, defaultAdvisor);
		};
	}
}
