package odev_Soruları;

import java.util.Scanner;

public class Q1_MidNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
        int a=scan.nextInt();
        System.out.println("please enter second number");
        int b=scan.nextInt();
        System.out.println("please enter third number");
        int c=scan.nextInt();

        System.out.println( (a>b)?( (a<c)?a:(b>c)? b:c  )     :  (   (a>c)?a:((b>c)?c:b) ) ) ;
}}
