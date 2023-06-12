package org.example.backend.model;

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private String password;

    public User(String name, String phoneNumber, String password) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
