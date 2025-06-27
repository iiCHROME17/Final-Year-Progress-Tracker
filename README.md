# Final Year Project Tracker (FYP Tracker)

**Abstract:**
A web application for students to submit project milestones, with advisor review, feedback, and document uploads, streamlining final year project management.

## Project Description
FYP Tracker is a Java Spring Boot web application designed to help students and advisors manage the progress of final year projects. Students can submit milestones and upload documents, while advisors can review, approve, and provide feedback, all within a secure and user-friendly platform.

## Computer Science Roles Demonstrated

### Technical Delivery Management
- Requirements gathering and project planning
- Stakeholder communication (students, advisors)
- Iterative delivery and progress tracking

### Software Engineering
- Object-oriented design and domain modeling
- RESTful web service development
- Secure authentication and authorization
- File upload and data persistence

### DevOps
- Automated builds with Maven
- Environment configuration and management
- Local development with embedded H2 database
- Deployment-ready structure for cloud or on-premise hosting

## Entities

### Student
Represents a student working on a final year project. Stores personal and login information, and the name of their project.
- Fields: id, name, email, password, projectName

### Advisor
Represents a faculty member supervising students. Stores personal and login information.
- Fields: id, name, email, password, (optional: department)

### Milestone
Represents a project milestone (e.g., Proposal, Report). Tracks submissions, status, and feedback.
- Fields: id, title, description, dueDate, student, documentPath, status, advisor, feedback

### Feedback
(Optional as a separate entity) Allows multiple feedback entries per milestone.
- Fields: id, milestone, advisor, comment, date

## Relationships
- A **Student** can submit multiple **Milestones** (1 to many relationship)
- An **Advisor** can review and approve multiple **Milestones** (1 to many relationship)
- Each **Milestone** is linked to one **Student** and one **Advisor** (many to one relationship)
- Each **Milestone** can have feedback (either as a field or as multiple **Feedback** entries)

Diagram:

    Student 1---* Milestone *---1 Advisor
                       |
                       *---* Feedback (optional)

## Development Pipeline

This project uses the Java Spring Boot framework, which provides a rapid development pipeline for building secure, production-ready web applications. The typical workflow is:

1. **Code**: Write Java code for entities, repositories, services, and controllers.
2. **Build**: Use Maven to compile the code and manage dependencies.
3. **Run**: Start the application with the embedded Tomcat server (`mvnw spring-boot:run`).
4. **Test**: Use JUnit and Spring Boot Test for automated testing.
5. **Iterate**: Hot reload with Spring Boot DevTools for fast feedback during development.
6. **Deploy**: Package as a JAR for deployment to cloud or on-premise servers.

### Main Dependencies
- **Spring Boot Starter Web**: For building RESTful web applications
- **Spring Boot Starter Data JPA**: For database access and ORM
- **Spring Boot Starter Security**: For authentication and authorization
- **Spring Boot Starter Thymeleaf**: For server-side HTML rendering
- **H2 Database**: In-memory database for development and testing
- **Lombok**: Reduces boilerplate code (getters, setters, etc.)
- **Spring Boot DevTools**: Enables hot reload during development

### AI Usage
This project has made use of AI tools to assist in Debugging & Documentation. This includes this README file and the javadoc comments generated for the classes and methods. AI tools have also been used to generate boilerplate code and provide suggestions for best practices in Java and Spring Boot development. The aim of this project is to understand RESTful web services, Spring Boot, and the overall software development lifecycle, rather than to create an AI-driven application, but AI tools have been leveraged to enhance productivity and code quality.

All dependencies are managed via the `pom.xml` file using Maven.
