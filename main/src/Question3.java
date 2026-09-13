/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 3*/

/*Write a program called Question3.java that uses a while loop to
 print all the even numbers between 1 and 50.*/

public class Question3 {
    public static void main(String[] args){

        int number = 50;
        int count = 0;
        int sum = 0;

        //while loop to count all even numbers from 1 to 50 and add them
        while (count <= 50){
            sum = sum + count;
            count+=2;
        }
        System.out.println(sum);

    }
}
