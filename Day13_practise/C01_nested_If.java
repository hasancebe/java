package Day13_practise;

import java.util.Scanner;

public class C01_nested_If {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a word");
        String str= scan.next();
        if(str.length()>3&& str.length()%2==1){
            int a=str.length()/2;
            System.out.println(str.charAt(a));
        }
        else {
            System.out.println("entered word's character number is not odd number");
        }
    }
}
