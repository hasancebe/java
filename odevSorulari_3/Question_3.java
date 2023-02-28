package odevSorulari_3;

import java.util.Scanner;

//Fibonacci numbersComplete a method **fib()** that will compute
// Fibonacci numbersIn the Fibonacci series, the next number is the sum of
// previous two numbers. For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc...
//The first two numbers of the Fibonacci series are 0 and 1.
// (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)
// You are given a number num, print n-th Fibonacci Number.Examples:```
//Input  : 2
//Output : 1
//(Explanation : index number 2 in the sequence of 0, 1, 1 --> 1)
//```
//Input  : 8
//Output : 21
//(Explanation : index number 8 in the sequence of
//0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
public class Question_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");

        int number= 0;
        try {
            number = scan.nextInt();
        } catch (Exception e) {
            System.out.println(" do not enter another charter");
        }
        if(number<=0)
            System.out.println("please enter positive number");
        if(number==1)
            System.out.println(1);
        if(number>=2)
        fibonacciNumber(number);
        }

    public static void fibonacciNumber(int nmbr){

        int firstNumber=0;
        int secondNumber=1;
        int thirdNumber=0;

            System.out.print("" + firstNumber + " " + secondNumber);

            for (int i = 0; i < nmbr-1 ; i++) {
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                System.out.print(" " + thirdNumber);

        }
        System.out.println("--> " + thirdNumber);
    }
}


