package ClassPackage;

import javax.swing.*;
import java.util.Scanner;

public class PhoneBookApp {
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        printMainMenu();
    }

    public static void print(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public static String input(String message){
        return JOptionPane.showInputDialog(null, message);
    }

    private static void printMainMenu(){
        String message = """
     === Welcome To Phonebook ===\s
     1 -> Add a new Contact
     2 -> Edit a Contact\s
     3 -> Delete a Contact
     4 -> Find a Contact By Name
     5 -> View all Contacts
     0-> Exit\s
         \s
   \s""";
        print (message);
        switch (input("Choose an option")){
            case "1" -> addContact();
            case "2" -> editContact();
            case "3" -> deleteContact();
            case "4" -> findContactByName();
            case "5" -> viewContact();
            case "0" -> System.exit(0);
            default ->{
                print("Invalid option");
                printMainMenu();
            }
        }
    }

    public static void addContact() {
        try {
            phoneBook.addContact(input("Enter name"), input("Enter phone number"));
            print("Contact added successfully!");
            printMainMenu();
        }
        catch (InvalidContactException | EmptyContactException e) {
            print(e.getMessage());
            printMainMenu();
        }
    }

    public static void editContact() {
        try {
            phoneBook.editContact(input("Enter contact to be edited: "), input("Enter new name: "), input("Enter new phone number: "));
            print("Contact edited successfully!");
            printMainMenu();
        }
        catch (InvalidContactException | EmptyContactException e) {
            print(e.getMessage());
            printMainMenu();
        }
    }

    public static void deleteContact() {
        try {
            phoneBook.deleteContact(input("Enter contact to be deleted: "));
            print("Contact deleted successfully!");
            printMainMenu();
        }
        catch (InvalidContactException | EmptyContactException e) {
            print(e.getMessage());
            printMainMenu();
        }
    }

    public static void findContactByName() {
        try {
            phoneBook.findContactByName(input("Enter contact name: "));
            print("Contact found successfully!");
            printMainMenu();
        }
        catch (InvalidContactException | EmptyContactException e) {
            print(e.getMessage());
            printMainMenu();
        }
    }

    private static void viewContact() {
        try {
            phoneBook.viewContact();
            printMainMenu();
        }
        catch (InvalidContactException | EmptyContactException e) {
            print(e.getMessage());
            printMainMenu();
        }
    }

}
