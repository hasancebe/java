package day03_Math;
import java.util.Scanner;
public class C06_question {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number");

        double sayi1=scan.nextDouble();

        System.out.println("please enter a second number");
        int sayi2=scan.nextInt();

        int sonuc= (int)(sayi1/sayi2);
        System.out.println(sonuc);


    }
}
