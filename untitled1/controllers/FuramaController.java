package controllers;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu(int x) {
        if (x == 1) {
                    System.out.println("\n" +
                            "the number you just selected it corresponds to Employee Management");
                    System.out.println("Display list employees");
                    System.out.println("Add new employee");
                    System.out.println("Edit employee");
                    System.out.println("Return main menu");
                }
                if (x == 2) {
                    System.out.println("the number you just selected it corresponds to Customer Management");
                    System.out.println("Display list customers");
                    System.out.println("Add new customer");
                    System.out.println("Edit customer");
                    System.out.println("Return main menu");
                }
                if (x == 3) {
                    System.out.println("the number you just selected it corresponds to Facility Management");
                    System.out.println("Display list facility");
                    ;
                    System.out.println("Add new facility");
                    ;
                    System.out.println("Display list facility maintenance");
                    System.out.println("Return main menu");
                }
                if (x == 4) {
                    System.out.println("the number you just selected it corresponds to Booking Managerment");
                    System.out.println("Add new booking");
                    System.out.println("Display list booking");
                    System.out.println("Create new constracts");
                    System.out.println("Display list contracts");
                    System.out.println("Edit contracts");
                    System.out.println("Return main menu");
                }
                if (x == 5) {
                    System.out.println("the number you just selected it corresponds to Promotion Management");
                    System.out.println("Display list customers use service");
                    System.out.println("Display list customers get voucher");
                    System.out.println("Return main menu");
                }
                if (x==6){
                    System.out.println("you have exited the program");
                }


        }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int x;
        do {

            System.out.println("enter the number you want");
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");

            x = value.nextInt();
            displayMainMenu(x);

        }while (x < 6) ;
    }
    }

