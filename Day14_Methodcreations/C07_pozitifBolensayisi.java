package Day14_Methodcreations;

import java.util.Scanner;

public class C07_pozitifBolensayisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scan.nextInt();

        System.out.println(primeNumber1(number));
    }

    public static int primeNumber1(int a) {
        int bolen = 2;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                bolen = bolen + 1;
            }
        }
        return bolen;
    }
}