package task10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

    public class FacilityValidation {

        public static void validateNewFacility(String code, String name, double area, double poolArea, double rentalCost, int maxOccupancy, int floors, String rentalType, String standard, String birthdate) throws Exception {

            // Validate code
            Pattern codePattern = Pattern.compile("^(VL|HO|RO)-\\d{4}$");
            Matcher codeMatcher = codePattern.matcher(code);
            if (!codeMatcher.matches()) {
                throw new Exception("Invalid facility code. Facility code must be in format: SVXX-YYYY, with XX is VL, HO, or RO and YYYY is 4 digit number.");
            }

            // Validate name
            Pattern namePattern = Pattern.compile("^[A-Z][a-z]*$");
            Matcher nameMatcher = namePattern.matcher(name);
            if (!nameMatcher.matches()) {
                throw new Exception("Invalid facility name. Facility name must start with uppercase letter, followed by lowercase letters.");
            }

            // Validate area
            if (area <= 30) {
                throw new Exception("Invalid area. Facility area must be greater than 30m2.");
            }

            // Validate pool area
            if (poolArea <= 30) {
                throw new Exception("Invalid pool area. Facility pool area must be greater than 30m2.");
            }

            // Validate rental cost
            if (rentalCost <= 0) {
                throw new Exception("Invalid rental cost. Rental cost must be greater than 0.");
            }

            // Validate max occupancy
            if (maxOccupancy <= 0 || maxOccupancy >= 20) {
                throw new Exception("Invalid max occupancy. Max occupancy must be greater than 0 and less than 20.");
            }

            // Validate floors
            if (floors <= 0) {
                throw new Exception("Invalid number of floors. Number of floors must be greater than 0.");
            }

            // Validate rental type
            if (!rentalType.equals("Villa") && !rentalType.equals("House") && !rentalType.equals("Room")) {
                throw new Exception("Invalid rental type. Rental type must be either Villa, House, or Room.");
            }

            // Validate standard
            if (!standard.equals("A") && !standard.equals("B") && !standard.equals("C")) {
                throw new Exception("Invalid facility standard. Facility standard must be either A, B, or C.");
            }

            // Validate birthdate
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(birthdate, formatter);
            int age = today.getYear() - date.getYear();
            if (age < 18 || age > 100) {
                throw new Exception("Invalid birthdate. User must be between 18 and 100 years old.");
            }
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter facility code: ");
            String code = scanner.nextLine();

            System.out.print("Enter facility name: ");
            String name = scanner.nextLine();

            System.out.print("Enter facility area: ");
            double area = scanner.nextDouble();

            System.out.print("Enter facility pool area: ");
            double poolArea = scanner.nextDouble();

            System.out.print("Enter facility rental cost: ");
            double rentalCost = scanner.nextDouble();

            System.out.print("Enter facility max occupancy: ");
            int maxOccupancy = scanner.nextInt();

            System.out.print("Enter number of floors: ");
            int floors = scanner.nextInt();

            System.out.print("Enter rental type: ");
            String rentalType = scanner.nextLine();
            rentalType = scanner.nextLine();

            System.out.print("Enter facility standard: ");
            String standard = scanner.nextLine();

            System.out.print("Enter birthdate (dd/mm/yyyy): ");
            String birthdate = scanner.nextLine();

            try {
                FacilityValidation.validateNewFacility(code, name, area, poolArea, rentalCost, maxOccupancy, floors, rentalType, standard, birthdate);
                System.out.println("Facility information is valid.");
            } catch (Exception e) {
                System.out.println("Invalid facility information: " + e.getMessage());
            }
        }



}
