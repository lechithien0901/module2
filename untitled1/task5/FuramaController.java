package task5;

import java.util.Scanner;

public class FuramaController {
    private static task5.FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();

    public static void facilityManagement() {

        Scanner scanner = new Scanner(System.in);
boolean check=true;
        while (true) {
            System.out.println("FACILITY MANAGEMENT");
            System.out.println("1. Display list facilities");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facilities need maintenance");
            System.out.println("4. Back to main menu");
            System.out.println("5.stop programme");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    facilityServiceImpl.displayFacility();
                    break;
                case 2:
                    facilityServiceImpl.addNewFacility();
                    break;
                case 3:
                   facilityServiceImpl.displayFacilityNeedMaintenance();
                    break;
                case 4:
                    return;
                case 5:
                    check=false;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
