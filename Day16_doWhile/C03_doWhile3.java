package Day16_doWhile;

import java.util.Scanner;

public class C03_doWhile3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str="";
        do{
            System.out.println("please enter a word");
            str= scan.nextLine();
            if((str.length()>=3)&& (str.length()%2==1)){
                System.out.println(str.charAt(str.length()/2));

            }else {
                System.out.println("you entered wrong word");
            }
        }        while((str.length()>=3)&& (str.length()%2==1));
    }
}
