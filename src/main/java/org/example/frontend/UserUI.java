package org.example.frontend;

import org.example.backend.service.Response;
import org.example.backend.UserServiceImpl;
import org.example.backend.model.Contact;
import org.example.backend.service.UserService;

import java.util.List;

public class UserUI {
    public static void window() {

        while (true) {

            System.out.println("""
                    1. Login
                    0. Exit 
                    """);
            String option = ScannerUtil.getInputAsString("?:");
            if (option == "1") {
                login();
            } else if (option == "0") {
                return;
            }
        }

    }

    private static void login() {

        String phoneNumber = ScannerUtil.getInputAsString("Enter phone number");
        String password = ScannerUtil.getInputAsString("Enter password");

        UserService userService = new UserServiceImpl() ;
        Response response = userService.login(phoneNumber, password);
        System.out.println(response);
        if (response.success()) {
            cabinet(phoneNumber);
        }

    }

    private static void cabinet(String phoneNumber) {
        while (true){
            System.out.println("""
                    1.add contact;
                    2.show contact
                    0. Exit
                    """);
            String option = ScannerUtil.getInputAsString("?:");
            if (option.equals("1")) addContact(phoneNumber);
            if (option.equals("2")) showContact(phoneNumber);
            if (option.equals("0")) return;
        }
    }

    private static void showContact(String phoneNumber) {
        UserService userService = new UserServiceImpl();
        List<Contact> contactList = userService.getContact(phoneNumber);
        if (contactList.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        contactList.forEach(System.out::println);
    }

    private static void addContact(String phoneNumber) {
        String newNumber = ScannerUtil.getInputAsString("Enter phone number : ");
        String name = ScannerUtil.getInputAsString("Enter phone number : ");
         UserService userService = new UserServiceImpl();
        Response response = userService.addContact(phoneNumber, newNumber, name);
        System.out.println(response);
    }
}
