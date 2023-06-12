package org.example.backend.service;

import org.example.backend.model.Contact;

import java.util.List;

public interface UserService {
     Response login(String phoneNumber, String password) ;

     Response addContact(String phoneNumber, String newNumber, String name);

     List<Contact> getContact(String phoneNumber);
}
