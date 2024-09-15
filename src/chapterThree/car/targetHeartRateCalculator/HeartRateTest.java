package chapterThree.car.targetHeartRateCalculator;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter month of birth (1-12): ");
        int monthOfBirth = scanner.nextInt();

        System.out.print("Enter day of birth (1-31): ");
        int dayOfBirth = scanner.nextInt();

        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        HeartRates heartRates = new HeartRates(firstName, lastName, monthOfBirth, dayOfBirth, yearOfBirth);

        System.out.println("First Name: " + heartRates.getFirstName());
        System.out.println("Last Name: " + heartRates.getLastName());
        System.out.println("Date of Birth: " + heartRates.getMonthOfBirth() + "/" + heartRates.getDayOfBirth() + "/" + heartRates.getYearOfBirth());
        System.out.println("Age: " + heartRates.calculateAge());
        System.out.println("Maximum Heart Rate: " + heartRates.calculateMaxHeartRate());

    }
}
