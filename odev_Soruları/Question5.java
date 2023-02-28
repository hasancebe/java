package odev_Soruları;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter first word");
        String firstWord = scan.next();

        System.out.println("please enter second word");
        String secondWord = scan.next();
        if(firstWord.length()!= secondWord.length()){
            System.out.println(firstWord.length()>secondWord.length()?firstWord:secondWord);
        }else{
            System.out.println("please enter two words different lengt");
        }
}}
