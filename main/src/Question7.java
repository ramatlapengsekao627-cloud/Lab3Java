/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 7*/

/*Write a program called Question7.java that asks the user to enter a number,
then uses a for loop to print that number's multiplication table from 1 to 12.*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask the user for a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // print the multiplication table from 1 to 12
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
