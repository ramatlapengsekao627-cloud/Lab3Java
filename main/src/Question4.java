/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 4*/

/*Write a program called Question4.java that repeatedly displays a simple menu
(1. Continue   2. Exit) using a do-while loop. The
program should keep showing the menu until the user enters 2.*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
            int number;

            // do-while runs at least once, then repeats until the user enters the number 2
            do {
                System.out.println("1. Continue");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                number = input.nextInt();
                System.out.println("Looks like we'll be here for a while.");

            } while (number != 2);

            System.out.println("took long enough");
    }
}
