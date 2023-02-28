package Day01_practise;

import java.util.Scanner;
// girdiğin sayı kadar yıldız giren kod
public class C01_practise01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("küçük kenar giriniz");
        int a=scan.nextInt();
        System.out.println("büyük kenar giriniz");
        int b=scan.nextInt();
        int c=0;
        while(c<b){//
            for(int i=0; i<a; i++){
                System.out.print("*");

            }
            System.out.println();
            c++;
        }
    }
}
