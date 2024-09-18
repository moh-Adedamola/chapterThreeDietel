package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5 Digit Number: ");
        int number = scanner.nextInt();
        while(number < 10000 || number > 99999) {
            System.out.print("Entered number must be exactly a 5 Digit Number: ");
            number = scanner.nextInt();
        }

        int digit1 = number / 10000; 
        int digit2 = number % 10000 / 1000;
        int digit3 = number % 1000 / 100;
        int digit4 = number % 100 / 10;
        int digit5 = number % 10;

        if(digit1 == digit5 && digit2 == digit4)
            System.out.println("Number is a Palindrome!");
        else
            System.out.println("Number is not a Palindrome");
    }
}
