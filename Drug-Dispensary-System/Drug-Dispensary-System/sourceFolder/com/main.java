package com.DrugDispenser;

import java.util.Scanner;

public class main {
    public static String input(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    public static void print(String message){
        System.out.println(message);
    }

    public static void printMainMenu(){
        String menu = """
        
        Drug Dispensary System
        1 -> Register as Doctor
        2 -> Register as Pharmacist
        3 -> Exit
        
        """;
        print(menu);

        switch(input("Press 1 to register as a Doctor and 2 to register as Pharmacist: ")) {
            case "1" -> registerDoctor();
            case "2" -> registerPharmacist();
            case "3" -> System.exit(0);
            default -> print("invalid input");
        }
    }

    public static void registerDoctor(){
        String doctorName = input("Enter doctor name: ").toLowerCase();
        String doctorPassword = input("Enter doctor password: ").toLowerCase();
        print("Doctor Registered Successfully!");
        printMainMenu();
    }

    private static void registerPharmacist() {
        String pharmacistName = input("Enter pharmacist name: ").toLowerCase();
        String pharmacistPassword = input("Enter pharmacist password: ").toLowerCase();
        print("Pharmacist Registered Successfully!");
        printMainMenu();
    }

    public static void main(String[] args) {
        printMainMenu();
    }
}
