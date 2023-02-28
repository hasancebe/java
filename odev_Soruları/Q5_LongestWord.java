package odev_Soruları;

import java.util.Scanner;
//Write a program that will print out the longest word.
//Note: Assume the length of the two given Strings will be different```
//input:
//bill
//check
//output: check
public class Q5_LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter first word");
        String firstWord = scan.next();

        System.out.println("please enter second word");
        String secondWord = scan.next();
        if (firstWord.length() != secondWord.length()) {
            System.out.println(firstWord.length() > secondWord.length() ? firstWord : secondWord);
        } else {
            System.out.println("please enter two word of diffrent lenght");

        }
    }
}