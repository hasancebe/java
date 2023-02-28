package day12_forloops;

import java.util.Scanner;

public class C03_Faktoriel {
    public static void main(String[] args) {
        //kullanıcının girdiği sayının faktoriyelini bulalım
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayi=scan.nextInt();

        int faktoriel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriel=faktoriel*i;
        }
        System.out.println(faktoriel);
        System.out.println();
        // 1 den 100 e olan sayıların toplamı
int toplam=0;
        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;

        }
        System.out.print(toplam);
    }
}
