package day05;

import java.util.Scanner;

public class C_03questions {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number" );
        int a= scan.nextInt();

        if(a%5==0 && a%3==0){
            System.out.println("number divisible 3 and 5");
        }
    }
}
