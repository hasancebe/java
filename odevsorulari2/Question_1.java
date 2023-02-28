package odevsorulari2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a number");


        try {
            int number= scan.nextInt();
            System.out.println(factorial(number));
        } catch (InputMismatchException e) {
            System.out.println("you did not enter a number, please enter a anumber");

        }
    }


    public  static int factorial(int number){
        int result=1;
        if(number!=0){
        for (int i = number; i >1 ; i--) {
            result=result*i;}

        } else if ((number<0)) {
            System.out.println("please enter a positive number");

        } else {
            result=0;
        }

        return result;
    }
}
