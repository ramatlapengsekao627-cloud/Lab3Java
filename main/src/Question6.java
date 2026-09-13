/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 6*/

/*Write a program called Question6.java that uses a do-while loop to repeatedly
ask the user to enter a number, adding each one to a running total, and stops
as soon as the user enters 0. Once the loop ends, print the final total*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        // keep asking for numbers and adding them, until 0 is entered
        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            total += number; // add number to total

        } while (number != 0);

        System.out.println("Final total: " + total);
    }
}
