/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 1*/

/*Write a program called Question1.java that uses a while loop to print a countdown
from 10 down to 1, then prints "Liftoff!" once the loop finishes.*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){

        int number = 10;

        //keep running the loop until condition is met
        while (number >= 1){
            System.out.println(number);
            number--;
        }
        System.out.println("Lift off!");

    }
}
