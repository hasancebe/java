package odevsorulari2;

import java.util.Scanner;

//Write a program that will create a triangle of asterisks based on size **n**.Example:```
//input: 5output:
//*
//**
//***
//****
public class Questioon_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scan.nextInt();
        System.out.println("please enter a char");
        String star= scan.next();
        //String star="*";
        for (int i = 1; i <=number ; i++) {
            System.out.println(star.repeat(i));

        }
    }

}
