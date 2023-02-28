package odevsorulari2;

import java.util.Arrays;
import java.util.Scanner;

//Cats and DogsPrint true if the string _"cat"_ and _"dog"_ appear the same number of
// times in the given string _word_.Example:```
//input: catdog
//output: true
//```Example:```
//input: catcat
//output: false
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int catCount = 0;
        int dogCount = 0;
        System.out.println("please enter a sentence");
        String sentence = scan.nextLine();


        for (int i = 0; i < sentence.length() - 2; i++) {

            if (sentence.substring(i, (i + 3)).equalsIgnoreCase("cat"))
                catCount += 1;
            if (sentence.substring(i, (i + 3)).equalsIgnoreCase("dog"))
                dogCount += 1;
        }
        if (catCount != dogCount) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
