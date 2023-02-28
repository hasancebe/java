package Day14_Methodcreations;

import java.util.Scanner;

public class C01_methodolusturma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter  first number");
        int firstNumber= scan.nextInt();
        System.out.println("please enter second number");
        int secondNumber= scan.nextInt();
        System.out.println(Multiplication(firstNumber,secondNumber));
        System.out.println(Multiplication(firstNumber,secondNumber));
    }
    public static int Multiplication (int a, int b){
        int result = a*b;
        return result;

    }
}
