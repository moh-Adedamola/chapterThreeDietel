package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        for(int counter=0;counter<10;counter++){
        System.out.println("Enter an integer:");
        int number = input.nextInt();

            if(number > largest)
                largest = number;
        }

        System.out.print("Largest integer is: " + largest);
    }
}
