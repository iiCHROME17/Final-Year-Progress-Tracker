# Progress Log

This log tracks my journey building the Final Year Project Tracker using Java Spring Boot.

---

**[DATE: 27/06/2025]**

- I set up my development environment with Java, Maven, and an IDE.
- I generated a new Spring Boot project using Spring Initializr, selecting the necessary dependencies.
- I fixed the project structure to follow the standard Maven/Spring Boot layout.
- I ran the application for the first time and confirmed it started successfully (saw the Whitelabel Error Page).
- I planned out the main entities (Student, Advisor, Milestone, Feedback) and their relationships.
- I created a README with a project description, abstract, and roles demonstrated.
- I implemented the Student, Advisor, Milestone, and Feedback entity classes in the correct package.
- I created a StudentRepository interface to enable CRUD operations for students.
- I added a Development Pipeline section to the README to document the workflow and dependencies.
- I updated the Student entity to include a projectName field.
- I updated all related code to set and display the project name for each student.
- The application now prints both student names and their project names to the console.
- I generated service and controller classes for Advisor, Milestone, and Feedback, enabling REST API endpoints for CRUD operations on all main entities.
- I added constructors for Advisor and improved the display of admin credentials at startup.
- I implemented a login system for students and advisors, which will be expanded upon in future updates.
- I added Javadoc documentation to all main entity classes, configuration, and application startup methods for better maintainability and understanding.

---

I'll continue to update this log as I make progress on the project. 

### To Implement:
-  Custom UserDetails for Student and Advisor for proper authentication.