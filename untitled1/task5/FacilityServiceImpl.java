package task5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl {
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        facilityList.put(new Villa("V001", "Luxury Villa", 100, 100000, 5), 0);
        facilityList.put(new House("H001", "Deluxe House", 50, 50000, 3), 0);
        facilityList.put(new Room("R001", "Standard Room", 20, 20000, "Free breakfast"), 0);
    }

    public static void displayFacility() {
        System.out.println("List of all facilities:");
        for (Facility facility : facilityList.keySet()) {
            System.out.println(facility);
        }
    }

    public static void addNewFacility() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a facility type to add:");
        System.out.println("1. Villa");
        System.out.println("2. House");
        System.out.println("3. Room");
        System.out.println("4. Back to main menu");
        int choice = input.nextInt();
        input.nextLine(); // consume the leftover newline character

        switch (choice) {
            case 1:
                System.out.println("Enter villa ID:");
                String villaId = input.nextLine();
                System.out.println("Enter villa name:");
                String villaName = input.nextLine();
                System.out.println("Enter villa area:");
                double villaArea = input.nextDouble();
                System.out.println("Enter villa rental price:");
                double villaRentalPrice = input.nextDouble();
                System.out.println("Enter villa maximum number of guests:");
                int villaMaxGuests = input.nextInt();
                System.out.println("Enter villa room standard:");

                String villaRoomStandard = input.nextLine();
                System.out.println("Enter villa pool area:");
                double villaPoolArea = input.nextDouble();
                Villa newVilla = new Villa(villaId, villaName, villaArea, villaRentalPrice, villaMaxGuests, villaRoomStandard, villaPoolArea);
                facilityList.put(newVilla, 0);
                System.out.println("New villa has been added.");
                break;
            case 2:
                System.out.println("Enter house ID:");
                String houseId = input.nextLine();
                System.out.println("Enter house name:");
                String houseName = input.nextLine();
                System.out.println("Enter house area:");
                double houseArea = input.nextDouble();
                System.out.println("Enter house rental price:");
                double houseRentalPrice = input.nextDouble();
                System.out.println("Enter house maximum number of guests:");
                int houseMaxGuests = input.nextInt();
                System.out.println("Enter house room standard:");
                input.nextLine(); // consume the leftover newline character
                String houseRoomStandard = input.nextLine();
                System.out.println("Enter house number of floors:");
                int houseNumFloors = input.nextInt();
                House newHouse = new House(houseId, houseName, houseArea, houseRentalPrice, houseMaxGuests, houseRoomStandard, houseNumFloors);
                facilityList.put(newHouse, 0);
                System.out.println("New house has been added.");
                break;
            case 3:
                System.out.println("Enter room ID:");
                String roomId = input.nextLine();
                System.out.println("Enter room name:");
               String roomName = input.nextLine();
                System.out.println("Enter room area:");
                double roomArea = input.nextDouble();
                System.out.println("Enter room rental price:");
                double roomRentalPrice = input.nextDouble();
                System.out.println("Enter room maximum number of guests:");
                int roomMaxGuests = input.nextInt();
                System.out.println("Enter room extra service:");
                input.nextLine(); // consume the leftover newline character
                String roomExtraService = input.nextLine();
                Room newRoom = new Room(roomId, roomName, roomArea, roomRentalPrice, roomMaxGuests, roomExtraService);
                facilityList.put(newRoom, 0);
                System.out.println("New room has been added.");
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    public static void displayFacilityNeedMaintenance() {
        System.out.println("List of facilities need maintenance:");
        for (Facility facility : facilityList.keySet()) {
            if (facilityList.get(facility) >= 5) {
                System.out.println(facility);
            }
        }
    }
    public static void increaseFacilityUsage(Facility facilityType) {
        if (facilityList.containsKey(facilityType)) {
            facilityList.put(facilityType, facilityList.get(facilityType) + 1);
        }
    }
}