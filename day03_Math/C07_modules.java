package day03_Math;
import java.util.Scanner;
public class C07_modules {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number");
        int sayi1=scan.nextInt();



        System.out.println("please enter a second number");
        int sayi2=scan.nextInt();

        int sonuc= (sayi1%sayi2);
        System.out.println(sonuc);

        System.out.println(568%69);
        //bölündüğünde kalanıbulma programı
    }
}
