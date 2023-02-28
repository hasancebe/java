package Day35_exepcition;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("please enter a integer");*/


       int a = 0;
        int b = 0;
       /* try {
            a = scan.nextInt();
            System.out.println("please enter a integer");
            b = scan.nextInt();*/
        int x;

       x =toplam(a,b);

            System.out.println(x);
       /* } catch (Exception e) {
            System.out.println("you did not a integer");
            toplam(a, b);
        }*/

    }
    public static int toplam(int a, int b){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a integer");
        try {
            a = scan.nextInt();
            System.out.println("please enter a integer");
            b = scan.nextInt();
           // System.out.println(toplam(a, b));
        } catch (Exception e) {
            System.out.println("you did not a integer");
            toplam(a, b);
        }

        int toplam=a+b;
        return  toplam;
    }
}
