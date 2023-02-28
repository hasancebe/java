package Day01_practise;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter two numbers");
        double number1= scan.nextDouble();
        double number2= scan.nextDouble();
        System.out.println("sum of the numbers "+ (number1+number2));
        //number1 + number2 ifadesini parantez içine almazsak toplama yapmaz, birleştirir.
    }
}
