package Day16_doWhile;

import java.util.Scanner;

public class c02_doWhile2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="";
        do{
            System.out.println("please enter 'x' and stop the program");
            str=scan.nextLine();
        }
        while(!str.equalsIgnoreCase("x"));
        System.out.println("program ended");
    }
}
