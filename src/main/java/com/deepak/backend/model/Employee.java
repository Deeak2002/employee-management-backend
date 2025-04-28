package com.deepak.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "photo_filename")
    private String photoFilename; // ✅ Photo ka filename store karenge

    public Employee() {}

    public Employee(String name, String email, String jobTitle, String photoFilename) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.photoFilename = photoFilename;
    }

    // Getters and setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getJobTitle() { return jobTitle; }

    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getPhotoFilename() { return photoFilename; }

    public void setPhotoFilename(String photoFilename) { this.photoFilename = photoFilename; }
}
