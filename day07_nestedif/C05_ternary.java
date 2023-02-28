package day07_nestedif;

import java.util.Scanner;

public class C05_ternary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("pease enter a number");
        int number= scan.nextInt();
        String a=(number%5==0)? "this number is multiple of 5" : "number is not multiple of 5";
        System.out.println(a);
    }
}
