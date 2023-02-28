package Day15_Methodoverloading;

import java.util.Scanner;

public class C05_question05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the calculation number and exponetial number");
        int number = scan.nextInt();
        int expo = scan.nextInt();
        System.out.println(exponetialCalculation(number, expo));

    }

    public static int exponetialCalculation(int a, int b) {
        int count = 1;
        int result = a;

        if (b == 0) {
            result = 1;
        } else {
            while (count < b) {
                result = result * a;
                count++;
            }

        }

        return result;
    }
}

