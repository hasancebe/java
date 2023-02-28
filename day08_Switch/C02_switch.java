package day08_Switch;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        // girilen rakamın kaçıncı ay olduğunu gösteren kod
        Scanner scan= new Scanner(System.in);
        System.out.println("rakam giriniz");
        int rakam=scan.nextInt();
        switch (rakam){
            case 1:
                System.out.println(rakam+"'inci ay ocak");
                break;
            case 2:
                System.out.println(rakam+"'inci ay şubat");
                break;
            case 3:
                System.out.println(rakam+"'üncü ay mart");
                break;
            case 4:
                System.out.println(rakam+"'üncü ay nisan");
                break;
            case 5:
                System.out.println(rakam+"'inci ay mayıs");
                break;
            case 6:
                System.out.println(rakam+"'ıncı ay haziran");
                break;
            case 7:
                System.out.println(rakam+"'inci ay temmuz");
                break;
            case 8:
                System.out.println(rakam+"'inci ay ağustos");
                break;
            case 9:
                System.out.println(rakam+"'uncu ay eylül");
                break;
            case 10:
                System.out.println(rakam+"'uncu ay ekim");
                break;
            case 11:
                System.out.println(rakam+"'inci ay kasım");
                break;
            case 12:
                System.out.println(rakam+"'inci ay aralık");
                break;
            default:
                System.out.println("uygun değer girilmedi");
        }
    }
}
