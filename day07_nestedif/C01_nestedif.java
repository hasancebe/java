package day07_nestedif;

import java.util.Scanner;

public class C01_nestedif {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please write your gender" );
        char letter= scan.next().charAt(0);
        System.out.println("pllease enter your age");
        int age = scan.nextInt();

        if (letter=='m'||letter=='M'){
                if (age>=65){
                    System.out.println("yoou can retire");
                }
                else{
                    System.out.println("you need work" + (65-age) + "years");
                }
        } else if (letter=='f'|| letter=='F') {
            if (age>=60){
                System.out.println("yoou can retire");
            }
            else{

                System.out.println("you need work" + (60-age) + "years");
            }

        }
    }

}
