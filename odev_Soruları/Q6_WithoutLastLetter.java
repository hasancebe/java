package odev_Soruları;

import java.util.Scanner;
//Given a String **txt** print the value without the last letterEx:```
//Input:
//foo
//Output:
//fo
public class Q6_WithoutLastLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a word");
        String word=scan.next();
        String withoutLastLetter=word.substring(0,word.length()-1);
        System.out.println(withoutLastLetter);
    }
}
