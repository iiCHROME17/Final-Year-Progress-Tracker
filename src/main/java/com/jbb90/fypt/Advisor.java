package com.jbb90.fypt;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // This is the primary key for the Advisor entity
    private String name; // Name of the advisor
    private String email; // The advisor's email address
    private String password; // The advisor's password

    public Advisor() {} // Constructor

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

}
