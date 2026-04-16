package com.bloopermessage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")

public class User {
    //Lifecycle hook that will set the datetime any time an insertion is made in the database
    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    //Lifecycle hook that will update the datetime any time an update is made in the database
    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Creating 'setter functions' which can be used for modifying data or making step by step class creations
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
