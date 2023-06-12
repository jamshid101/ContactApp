package org.example.backend;

import org.example.backend.model.Contact;
import org.example.backend.service.Response;
import org.example.backend.service.UserService;

import java.util.List;

public class    UserServiceImpl implements UserService {
    @Override
    public Response login(String phoneNumber, String password) {
        return null;
    }

    @Override
    public Response addContact(String phoneNumber, String newNumber, String name) {
        return null;
    }

    @Override
    public List<Contact> getContact(String phoneNumber) {
        return null;
    }
}
