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
Represents a student working on a final year project. Stores personal and login information.
- Fields: id, name, email, password

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
