package chapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the base of the triangle between 1 - 10: ");
        int baseLength = scanner.nextInt();
        for (int count = 1; count <= baseLength; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
