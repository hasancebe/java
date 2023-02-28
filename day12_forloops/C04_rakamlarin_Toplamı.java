package day12_forloops;

import java.util.Scanner;

public class C04_rakamlarin_Toplamı {
    public static void main(String[] args) {
        // kullanıcının verdiği sayının rakamları toplamı

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi=scan.nextInt();
        String sayiStr=""+sayi;
        int birler=0;
        int toplam=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            birler=sayi%10;
            toplam=toplam+birler;
            sayi=sayi/10;
        }
        System.out.println(toplam);
    }
}
