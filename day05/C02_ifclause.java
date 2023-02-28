package day05;

import java.util.Scanner;

public class C02_ifclause {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a integer");
        int a= scan.nextInt();
        System.out.println("please enter second integer");
        int b= scan.nextInt();


        if(a>100){
            System.out.println( a +" is bigger than 100");
        }
        if (b%2==0){
            System.out.println("entered number is even number");
        }
    }
}
