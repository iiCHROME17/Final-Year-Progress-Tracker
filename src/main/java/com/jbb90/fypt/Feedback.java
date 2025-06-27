package com.jbb90.fypt;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Entity representing feedback on a milestone in the FYP Tracker system.
 * Stores comments and links to the related milestone and advisor.
 */
@Entity
public class Feedback {
    /** Unique identifier for the feedback (auto-generated). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /** Comment provided as feedback. */
    private String comment;
    /** Date the feedback was given. */
    private LocalDate date;

    /** The milestone this feedback is for. */
    @ManyToOne
    private Milestone milestone;

    /** The advisor who gave the feedback. */
    @ManyToOne
    private Advisor advisor;

    /**
     * Default constructor required by JPA.
     */
    public Feedback() {}

    // Getters and setters with Javadoc
    /** @return the feedback ID */
    public Long getId() { return id; }
    /** @param id the feedback ID */
    public void setId(Long id) { this.id = id; }
    /** @return the feedback comment */
    public String getComment() { return comment; }
    /** @param comment the feedback comment */
    public void setComment(String comment) { this.comment = comment; }
    /** @return the feedback date */
    public LocalDate getDate() { return date; }
    /** @param date the feedback date */
    public void setDate(LocalDate date) { this.date = date; }
    /** @return the milestone this feedback is for */
    public Milestone getMilestone() { return milestone; }
    /** @param milestone the milestone this feedback is for */
    public void setMilestone(Milestone milestone) { this.milestone = milestone; }
    /** @return the advisor who gave the feedback */
    public Advisor getAdvisor() { return advisor; }
    /** @param advisor the advisor who gave the feedback */
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
} 