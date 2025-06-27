package com.jbb90.fypt;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
/**
 * Entity representing an advisor in the FYP Tracker system.
 * Stores personal information and login credentials for advisors.
 */
@Entity
public class Advisor {

    /** Unique identifier for the advisor (auto-generated). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // This is the primary key for the Advisor entity
    /** Name of the advisor. */
    private String name; // Name of the advisor
    /** Email address of the advisor. */
    private String email; // The advisor's email address
    /** Password for advisor login. */
    private String password; // The advisor's password

    /**
     * Default constructor required by JPA.
     */
    public Advisor() {} // Constructor

    /**
     * Constructs a new Advisor with the given details.
     * @param name the advisor's name
     * @param email the advisor's email
     * @param password the advisor's password
     */
    public Advisor(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /** @return the advisor ID */
    public Long getId() { return id; }
    /** @param id the advisor ID */
    public void setId(Long id) { this.id = id; }
    /** @return the advisor's name */
    public String getName() { return name; }
    /** @param name the advisor's name */
    public void setName(String name) { this.name = name; }
    /** @return the advisor's email */
    public String getEmail() { return email; }
    /** @param email the advisor's email */
    public void setEmail(String email) { this.email = email; }
    /** @return the advisor's password */
    public String getPassword() { return password; }
    /** @param password the advisor's password */
    public void setPassword(String password) { this.password = password; }

}
