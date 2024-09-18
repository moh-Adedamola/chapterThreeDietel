package chapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstLargest = 0;
        int secondLargest = 0;
        System.out.println("Enter 10 integers");
        for(int counter=0;counter<10;counter++){
            int number = input.nextInt();
            if(number > firstLargest){
                firstLargest = number;
            }
            else if(number < firstLargest && number > secondLargest){
                secondLargest = number;
            }

        }

        System.out.printf("Largest integer: %d\n", firstLargest);
        System.out.printf("Second Largest integer: %d\n", secondLargest);


    }
}
