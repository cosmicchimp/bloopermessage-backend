package com.bloopermessage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

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
    public String getName() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
