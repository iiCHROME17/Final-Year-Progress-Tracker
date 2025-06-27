package com.jbb90.fypt;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Entity representing a project milestone in the FYP Tracker system.
 * Tracks submissions, status, and feedback for each milestone.
 */
@Entity
public class Milestone {
    /** Unique identifier for the milestone (auto-generated). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /** Title of the milestone. */
    private String title;
    /** Description of the milestone. */
    private String description;
    /** Due date for the milestone. */
    private LocalDate dueDate;
    /** Path to the uploaded document for the milestone. */
    private String documentPath;
    /** Status of the milestone (e.g., SUBMITTED, APPROVED). */
    private String status;
    /** Feedback for the milestone. */
    private String feedback;

    /** The student who submitted the milestone. */
    @ManyToOne
    private Student student;

    /** The advisor who reviews the milestone. */
    @ManyToOne
    private Advisor advisor;

    /**
     * Default constructor required by JPA.
     */
    public Milestone() {}

    // Getters and setters with Javadoc
    /** @return the milestone ID */
    public Long getId() { return id; }
    /** @param id the milestone ID */
    public void setId(Long id) { this.id = id; }
    /** @return the milestone title */
    public String getTitle() { return title; }
    /** @param title the milestone title */
    public void setTitle(String title) { this.title = title; }
    /** @return the milestone description */
    public String getDescription() { return description; }
    /** @param description the milestone description */
    public void setDescription(String description) { this.description = description; }
    /** @return the milestone due date */
    public LocalDate getDueDate() { return dueDate; }
    /** @param dueDate the milestone due date */
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    /** @return the document path */
    public String getDocumentPath() { return documentPath; }
    /** @param documentPath the document path */
    public void setDocumentPath(String documentPath) { this.documentPath = documentPath; }
    /** @return the milestone status */
    public String getStatus() { return status; }
    /** @param status the milestone status */
    public void setStatus(String status) { this.status = status; }
    /** @return the milestone feedback */
    public String getFeedback() { return feedback; }
    /** @param feedback the milestone feedback */
    public void setFeedback(String feedback) { this.feedback = feedback; }
    /** @return the student who submitted the milestone */
    public Student getStudent() { return student; }
    /** @param student the student who submitted the milestone */
    public void setStudent(Student student) { this.student = student; }
    /** @return the advisor who reviews the milestone */
    public Advisor getAdvisor() { return advisor; }
    /** @param advisor the advisor who reviews the milestone */
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
} 