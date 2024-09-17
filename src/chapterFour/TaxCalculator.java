package chapterFour;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax = 0;

        System.out.print("Enter number of citizens: ");
        int numberOfCitizens = scanner.nextInt();

        for (int count = 0; count < numberOfCitizens; count++) {
            System.out.println("Enter citizen's name: ");
            String nameOfCitizen = scanner.next();
            System.out.printf("Enter %s's earnings: ", nameOfCitizen);
            double earnings = scanner.nextDouble();

            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = earnings * 0.20;
            }

            System.out.printf("%s's total tax is: $%.2f\n", nameOfCitizen, tax);

        }
    }
}
