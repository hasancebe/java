package day03_Math;
import java.util.Scanner;
public class C_08modules2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a fourdigit integer");
        int sayi= scan.nextInt(); //1253
    int firs_Digit=sayi%10;//3
        sayi=sayi/10;//125
            int secon_Digit=sayi%10;   //5
            sayi=sayi/10;  //12
            int third_digit=sayi%10;  //2
            sayi=sayi/10;//1

        int fourth_Digit=sayi;
        System.out.println(firs_Digit+secon_Digit+third_digit+fourth_Digit);

}}
