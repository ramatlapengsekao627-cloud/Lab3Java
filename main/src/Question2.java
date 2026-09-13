/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 2*/

/*Write a program called Question2.java that asks the user to enter a
positive whole number, then uses a while loop to calculate
and print the sum of all whole numbers from 1 up to that number.*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        //prompt the user
        System.out.print("Enter postive whole number: ");
        int number = input.nextInt();

        //loop that adds numbers from 1 upto given input
        while (count <= number){
            sum = sum + count;
            count++;
        }
        System.out.println(sum);

    }
}
