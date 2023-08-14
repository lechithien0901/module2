package controllers;

import java.util.Scanner;

public class FuramaController {
    public  static void displayMainMenu(int x){
        if (x==1){
            System.out.println("1 Display list employees");
            System.out.println("2 Add new employee");
            System.out.println("3 Edit employee");
            System.out.println("4 Return main menu");
        }
        if (x==2){
            System.out.println("1 Display list customers");
            System.out.println("2 Add new customer");
            System.out.println("3 Edit customer");
            System.out.println("4 Return main menu");
        }
        if (x==3){
            System.out.println("1 Display list facility");
            System.out.println("2 Add new facility");
            System.out.println("3 Display list facility maintenance");
            System.out.println("4 Return main menu");
        }
        if (x==4){
            System.out.println("1 Add new booking");
            System.out.println("2 Display list booking");
            System.out.println("3 Create new constracts");
            System.out.println("4 Display list contracts");
            System.out.println("5 Edit contracts");
            System.out.println("6 Return main menu");
        }
        if (x==5){
            System.out.println("1 Display list customer use service");
            System.out.println("2 Display list customers get voucher");
            System.out.println("3 Return main menu");
        }

    }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int x;
        do{
            System.out.println("===========================");
            System.out.println(" The Menu ");
            System.out.println("1 Employee Management");
            System.out.println("2 Customer Management");
            System.out.println("3 Facility Management");
            System.out.println("4 Booking Management");
            System.out.println("5 Promotion Management");
            System.out.println("6 Exit");
            System.out.println("===========================");
            System.out.println("Please choose your function : ");
            x=Integer.parseInt(value.nextLine());
            displayMainMenu(x);

        }while(x<6);
    }
}
