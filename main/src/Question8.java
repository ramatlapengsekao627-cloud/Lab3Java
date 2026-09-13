/*24019362
 * Sekao Ramatlapeng
 * Lab 3 Question 8*/

/*Write a program called Question8.java that asks the
user to enter a word or sentence, then uses a for loop to count and
print how many vowels (a, e, i, o, u) it contains.*/

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // ask the user for a word or sentence
        System.out.print("Enter a word or sentence: ");
        String text = keyboard.nextLine();

        int vowelCount = 0;

        // check each character in the text or word
        for (int i = 0; i < text.length(); i++) {

            //change to lower cases so that capital and small letters are treated the same way
            char letter = Character.toLowerCase(text.charAt(i));

            //check if letter has vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
