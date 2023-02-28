package odevsorulari2;

import java.util.Scanner;

//Print vowelsCreate a program that will take the given String
// **In** and print out all the vowels from the String.
// Example:```
//Input: howdyho
// Output: oo
//```
//Input: huehuehuehue
// Output: ueueueue
public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence = scan.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (    sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' ||
                    sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' ||
                    sentence.charAt(i) == 'u' ||sentence.charAt(i) == 'A' ||
                    sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' ||
                    sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U')
            {
                System.out.print(sentence.charAt(i));
            }
                }
            }
        }

