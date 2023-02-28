package Day14_Methodcreations;

import java.util.Scanner;

public class C08_PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scan.nextInt();
        System.out.println( isPrimeNumber(number));
    }

    public static String isPrimeNumber(int a) {
        String result="";

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                result = "ıt is not prime number";
                break;
            } else {
                result = "it is prime number";
            }


        }

        return result;
    }
}