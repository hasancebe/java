package odevsorulari2;

import java.util.Scanner;

//Repeat operatorGiven two strings, **word** and a separator **sep**, return a big string made of **count** occurrences of the word, separated by the separator string.Example:```
//input:
//Word
//X
//3
// output: WordXWordXWord
//```Example:```
//input:
//This
//And
//output: ThisAndThis
public class question6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a word");
        String word= scan.next();
        System.out.println("please enter seperator word");
        String separator= scan.next();
        System.out.println("please enter repeat number");
        int repeatNumber= scan.nextInt();

        String repeatWord=separator+word;
        System.out.println(word+repeatWord.repeat(repeatNumber-1));

    }
}
