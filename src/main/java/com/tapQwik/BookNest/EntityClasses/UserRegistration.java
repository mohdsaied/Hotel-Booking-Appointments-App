package com.tapQwik.BookNest.EntityClasses;

import jakarta.persistence.*;




@Entity
@Table(name = "user_registration")
public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "name",nullable = false, length = 30,unique = false)
    private String name;

    @Column(name = "user_name", nullable = false,length = 30,unique = false)
    private String userName;

    @Column(name = "email_id",nullable = false,length = 150,unique = true)
    private String emailId;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "user_role")
    private String userRole;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}