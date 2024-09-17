package chapterFour;
import java.util.Scanner;
public class salesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payPerWeek = 200;
        double commissionRate = 0.09;
        double totalSales = 0;


        System.out.print("Enter the number of items sold: ");
        int numberOfItems = scanner.nextInt();

        for (int count = 0; count < numberOfItems; count++) {
            System.out.printf("Enter value of item %d: ", count + 1);
            double itemPrice = scanner.nextDouble();

            totalSales += itemPrice;
        }

            double earnings = payPerWeek + (totalSales * commissionRate);
            System.out.printf("Total sales for the week: $%.2f\n", totalSales);
            System.out.printf("Earnings for the week: $%.2f\n", earnings);
    }
}

