package odevSorulari_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Print shortest wordWrite a program that will print the
// shortest word in the given array str.```
//input: java, cable, red, vivid, remedy, grace
// output: red

public class Question_2 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String word = "";
        System.out.println("please enter a word for wordlist and fpr finish press Q");

        while (!word.equalsIgnoreCase("q")) {

            word = scan.next();

            if (!word.equalsIgnoreCase("q")) {
                wordList.add(word);
            }
        }
        System.out.println(wordList);
        shortWord(wordList);
    }

            public static void shortWord(List<String>wordList){
         String shortest=wordList.get(0);
        for (int i = 1; i <wordList.size() ; i++) {

            if(shortest.length()>wordList.get(i).length()){
                shortest=wordList.get(i);
            }
        }
        System.out.println("shortest word: " + shortest);
    }
}

