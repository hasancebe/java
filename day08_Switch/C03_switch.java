package day08_Switch;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("rakam giriniz");
        int rakam=scan.nextInt();
        switch (rakam){
            case 1:
              //  System.out.print("ocak");
            case 2:
               // System.out.print("şubat");
            case 12:
                System.out.println(rakam+" .ay kış mevsimindedir");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("girilen ay ilkbahar mevsimindedir");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("girilen ay yaz mevsimindedir");
                break;

            case  9:
            case  10:
            case 11:
                System.out.println("girilen ay sonbahar mevsimindedir");
                break;

            default:
                System.out.println("girilen rakam uygun değil");

    }
}}
