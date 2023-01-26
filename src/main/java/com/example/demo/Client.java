package com.example.demo;

import org.springframework.data.annotation.Id;

public class Client {

    public Client() {
    }

    public Client(String description, String details, String email) {
        this.firstName = description;
        this.latName = details;
        this.email = email;
    }

    @Id
    private Long id;

    private String firstName;

    private String latName;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
