package Day35_exepcition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");



        try {
            int number = scan.nextInt();
            System.out.println(number * number);
        }
        catch (InputMismatchException e) {

            System.out.println("please enter a number");
            }
        }


    }


