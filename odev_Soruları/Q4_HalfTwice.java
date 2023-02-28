package odev_Soruları;

import java.util.Scanner;
//Write a program that will print out first half of the word twice.
public class Q4_HalfTwice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a word");
        String word=scan.next();
        String halfWord=word.substring(0,word.length()/2);
        System.out.println(halfWord.repeat(2));
    }
}
