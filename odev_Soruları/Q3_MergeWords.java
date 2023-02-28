package odev_Soruları;

import java.util.Scanner;

public class Q3_MergeWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter first word");
        String word1=scan.next();

        System.out.println("please enter second word");
        String word2=scan.next();
        String mergeWord="";
        if(!(word1.length()==3) || !(word2.length()==3) ){
            System.out.println("can not merge");
        } else  {
            for (int i = 0; i <3 ; i++) {
                mergeWord+=""+word1.charAt(i)+word2.charAt(i);
            }
            System.out.println(mergeWord);

        }
    }
}
