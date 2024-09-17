package chapterFour;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gasMileage= 0;
        double total = 0;

        while(gasMileage==0) {
            System.out.println("Enter the number of miles driven:  ");
            int miles = scanner.nextInt();
            System.out.println("Enter the number of gallons used for each tankful: ");
            int gallons = scanner.nextInt();

            double average = (double) miles /gallons;
            System.out.printf("Miles per gallon: %.2f\n", average);

            total += average;

            System.out.println("press 0 to enter more info or press 1 to stop.");
            gasMileage = scanner.nextInt();

        }

        System.out.printf("Miles per gallon for all trips: %.2f", total);

    }
}
