package chapterFour;

import java.util.Scanner;

public class creditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Customer's account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter balance at the beginnning of the month: ");
        int beginningBalance = input.nextInt();
        System.out.println("Enter total of all items charged by the customer this month: ");
        int charges = input.nextInt();
        System.out.println("Enter the total of all credits applied to customer's account this month: ");
        int credit = input.nextInt();
        System.out.println("Allowed credit limit: ");
        int creditLimit = input.nextInt();


        int newBalance = beginningBalance + charges - credit;

        System.out.printf("Your new balance is %d\n", newBalance);
        if(newBalance > creditLimit)
            System.out.println("Credit Limit Exceeded!\n");
    }
}
