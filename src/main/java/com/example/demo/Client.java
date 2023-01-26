package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


@Entity
@Table(name = "new_clients")
public class Client {

    public Client() {
    }

    public Client(String description, String details, String email) {
        this.firstName = description;
        this.lastName = details;
        this.email = email;
    }

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    @GeneratedValue()
    @Column
    private Long newClientId;

    @Column
    private String firstName;
    @Column()
    private String lastName;
    @Column()
    private String email;

    public Long getNewClientId() {
        return newClientId;
    }

    public void setNewClientId(Long newClientId) {
        this.newClientId = newClientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatName() {
        return lastName;
    }

    public void setLatName(String latName) {
        this.lastName = latName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
