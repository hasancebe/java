package Day13_practise;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter three digit number");
        int sayi= scan.nextInt();


        int yuzler= sayi/100;
        int onlar1 = sayi / 10;
        int onlar= onlar1%10;
        int birler = sayi % 10;

        switch(yuzler) {
            case 1:
                System.out.print("yüz ");
                break;
            case 2:
                System.out.print("ikiyüz ");
                break;
            case 3:
                System.out.print("üçyüz ");
                break;
            case 4:
                System.out.print("dörtyüz ");
                break;
            case 5:
                System.out.print("beşyüz ");
                break;
            case 6:
                System.out.print("altıyüz ");
                break;
            case 7:
                System.out.print("yediyüz ");
                break;
            case 8:
                System.out.print("sekizyüz ");
                break;
            case 9:
                System.out.print("dokuzyüz ");
                break;
        }

        switch(onlar) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmıs");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }
        switch(birler) {
            case 1:
                System.out.print(" bir");
                break;
            case 2:
                System.out.print(" iki");
                break;
            case 3:
                System.out.print(" üç");
                break;
            case 4:
                System.out.print(" dört");
                break;
            case 5:
                System.out.print(" beş");
                break;
            case 6:
                System.out.print(" altı");
                break;
            case 7:
                System.out.print(" yedi");
                break;
            case 8:
                System.out.print(" sekiz");
                break;
            case 9:
                System.out.print(" dokuz");
                break;
        }
    }
}
