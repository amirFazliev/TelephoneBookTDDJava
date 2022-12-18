package org.example;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("29926574", "Petya");
        phoneBook.add("54864161", "Qwerty");
        phoneBook.add("767218", "Amir");
        phoneBook.printAllNames();

    }
}