package day05;

import java.util.Scanner;

public class C04_qustion02{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please write letter" );
        String letter= scan.next();
        if ((letter.charAt(0)=='j')|| letter.charAt(0)=='J'){
            System.out.println("jan");
            System.out.println("Jun");
            System.out.println("July");
        }
        if ((letter.charAt(0)== 'f')|| letter.charAt(0)=='F'){
            System.out.println("Feb");
        }
        if ((letter.charAt(0)== 'm')|| letter.charAt(0)=='M'){
            System.out.println("March");
            System.out.println("May");
        }
        if ((letter.charAt(0)== 'a')|| letter.charAt(0)=='A'){
            System.out.println("Apr");
            System.out.println("Agu");
        }
        if ((letter.charAt(0)== 's')|| letter.charAt(0)=='S'){
            System.out.println("Sep");
        }
        if ((letter.charAt(0)== 'o')|| letter.charAt(0)=='O'){
            System.out.println("Oct");
        }
        if ((letter.charAt(0)== 'n')|| letter.charAt(0)=='N'){
            System.out.println("Nov");
        }
        if ((letter.charAt(0)== 'd')|| letter.charAt(0)=='D'){
            System.out.println("Dec");
        }
    }
}
