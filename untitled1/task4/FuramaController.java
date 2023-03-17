package task4;

import java.util.LinkedList;
import java.util.Scanner;

public class FuramaController {
    private static CustomerServiceImpl customerservice= new CustomerServiceImpl() {
        @Override
        public LinkedList<Customer> getAllCustomer() {
            return null;
        }

        @Override
        public void addCustomer() {

        }

        @Override
        public void upgradeCustomer() {

        }

        @Override
        public LinkedList<Customer> getAllCustomers() {
            return null;
        }

        @Override
        public void addCustomer(Customer customer) {
            super.addCustomer(customer);
        }

        @Override
        public void upgradeCustomer(Customer customer) {
            super.upgradeCustomer(customer);
        }
    };

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int choice;
             do{
                 System.out.println("=====Furama Resort=======");
                 System.out.println("1.view all Customer");
                 System.out.println("2.addCustomer");
                 System.out.println("3.Update customer information");
                 System.out.println("4.exit");
                 choice= value.nextInt();
                 switch (choice){
                     case 1:
                         displayCustomer();
                          break;
                     case 2:
                        addCustomer(value);
                        break;
                     case 3:
                         UpgradeCustomer(value);
                         break;
                     case 4:
                         System.exit(0);
                         break;
                     default:
                         System.out.println("vui lòng nhập các số từ 1 đến 4");
                 }

             }while(choice!=4);

    }
    private static void displayCustomer(){

        LinkedList<Customer> customers = customerservice.getAllCustomer();
        for(Customer customer:customers){
            System.out.println(customer);
        }
        System.out.println();

    }
    private static void addCustomer(Scanner scanner){
        System.out.println("nhập id vào đây");

        String id=scanner.next();
        System.out.println("nhập tên đầu tiên vào đây");
        String firstName=scanner.next();
        System.out.println("nhập tên cuối cùng vào đây");
        String lastName= scanner.next();
        System.out.println("nhập email vào đây ");
        String email= scanner.next();
        Customer customer=new Customer(id,firstName,lastName,email);
        customerservice.addCustomer(customer);
        System.out.println("Customer information add successfully");

    }
    private static void UpgradeCustomer(Scanner scanner) {
        System.out.println("=== UPDATE CUSTOMER INFORMATION ===");
        System.out.print("Enter customer ID: ");
        String id = scanner.next();
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter email: ");
        String email = scanner.next();
        Customer customer = new Customer(id, firstName, lastName, email);
       customerservice.upgradeCustomer(customer);
        System.out.println("Customer information updated successfully.");
        System.out.println();
    }

}
