package day07_nestedif;

import java.util.Scanner;

public class C02_nestedif {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please write your gender" );
        char letter= scan.next().charAt(0);
        System.out.println("pllease enter your age");
        int age = scan.nextInt();

    if (age<18){
        System.out.println("you entered invalid number");
    }
    else if (age>=18&&age<60) {
        System.out.println("you cant retire");
    }
        else if(age>=60 && age<650){
                if(letter=='f'|| letter=='M'){
            System.out.println("you can retire");
        }

    }
    }


    }
