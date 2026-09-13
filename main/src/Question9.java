/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 9*/

/*Write a program called Question9.java that asks the user to enter a whole number,
then uses a for loop to calculate and print its factorial*/

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user for a whole number
        System.out.print("Enter a whole number: ");
        int n = input.nextInt();

        int factorial = 1;

        // multiply factorial by each number from 1 up to n
        for (int i = 1; i <= n; i++) {
            factorial *= i; // same as factorial = factorial * i
        }
        System.out.println("Factorial: " + factorial);
    }
}
