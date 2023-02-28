package odevSorulari_3;

import java.util.Scanner;

//Split SentenceGiven a String variable **sentence,** write code to
// type each word in separate lines.Example:```
//sentence -> "Java is fun"
// Print
// Java
//is
//fun
public class Question_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence= scan.nextLine();
        for (int i = 0; i <sentence.length() ; i++) {
            if(sentence.charAt(i)==' '){
                System.out.println();}
                else{
                System.out.print(sentence.charAt(i));

                }
            }

        }
    }

