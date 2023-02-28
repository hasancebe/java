package day12_forloops;

public class C01_for {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        // 2 basamaklı 7 nin katı sayılar
        for (int i = 10; i <100 ; i++) {

            if(i%7==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 13 den başlayıp 100 e kadar 7 şer yazdıralım
        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 1 den 10 kadar (sınırlar dahil karelerini yazalım
        for (int i = 0; i <=10 ; i++) {
            System.out.print(i*i + " ");
        }


            }
}
