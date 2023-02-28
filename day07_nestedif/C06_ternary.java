package day07_nestedif;

import java.util.Scanner;

public class C06_ternary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("pease enter a letter");
        char letter=scan.next().charAt(0);
        System.out.println ((letter<=122) && (letter>=97) ? (char)(letter-32):(letter));
    }
}
