package odevsorulari2;

import java.util.InputMismatchException;
import java.util.Scanner;

//In mathematics a **factorial** of a positive integer _n_,
// denoted by _n_!, is the product of all positive integers less than or equal to _n_.
// Calculate factorial and output result to the console.Example:```
//input: 5
//output: 120
// 5 * 4 * 3 * 2 * 1
public class Question1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number= 0;

        try {
            number = scan.nextInt();
            if(factorial(number)!=1)
                System.out.println(factorial(number));
        } catch (InputMismatchException e) {
            System.out.println("you did not enter a number, please enter a number");

        }
    }
           public static int factorial(int number){
                int result=1;
                 for (int i = number; i >1 ; i--) {
                result=result*i;
        }
                return result;
    }
}
