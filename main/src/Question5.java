/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 5*/

/*Write a program called Question5.java that uses a do-while loop to keep
asking the user to enter a number between 1 and 10
(inclusive), only stopping once a valid number has been entered*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;

        // keep asking until the user enters a number between 1 and 10
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number  = input.nextInt();
        }
        while (number <= 1 || number >= 10 );

        System.out.println("Finally a valid number");
    }
}
