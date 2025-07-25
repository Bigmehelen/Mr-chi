package ClassPackage;

import java.util.Scanner;

public class PhoneBookApp {
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        printMainMenu();
    }

    public static String print(String message){
        System.out.println(message);
        return message;
    }

    public static String input(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    private static void printMainMenu(){
        String message = """
     === Welcome To Phonebook === 
     1 -> Add a new Contact
     2 -> Edit a Contact 
     3 -> Delete a Contact
     4 -> Find a Contact By Name
     5 -> View all Contacts
     6-> Exit 
     0 -> Back      
    """;
        print (message);
        switch (input("Choose an option")){
            case "1" -> addContact();
            case "2" -> editContact();
            case "3" -> deleteContact();
            case "4" -> findContactByName();
            case "5" -> viewContact();
            case "6" -> printMainMenu();
            case "0" -> printMainMenu();
            default -> print("Invalid option");
        }
    }

    public static void addContact() {
        String name = input("Enter your name: ");
        String phoneNumber = input("Enter your phone number: ");
        phoneBook.addContact(name, phoneNumber);
        print("Contact added successfully!");
        printMainMenu();
    }

    public static void editContact() {
        String name = input("Enter your name: ");
        String newName = input("Enter your new name: ");
        String phoneNumber = input("Enter your phone number: ");
        try {
            phoneBook.editContact(name, newName, phoneNumber);
        }
        catch (EmptyContactException e) {
            print("Contact name is empty!");
            throw e;
        }
        print("Contact edited successfully!");
        printMainMenu();
    }

    public static void deleteContact() {
        String name = input("Enter your name: ");
        phoneBook.deleteContact(name);
        print("Contact deleted successfully!");
        printMainMenu();
    }

    public static void findContactByName() {
        String name = input("Enter your name: ");
        phoneBook.findContactByName(name);
        print("Contact found successfully!");
        printMainMenu();
    }

    private static void viewContact() {
        phoneBook.viewContact();
        printMainMenu();
    }

}
