package day07_nestedif;

import java.util.Scanner;

public class C03_number {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please write number" );
        int number= scan.nextInt();
        if (number%2!=0){
                if(number<0){
                    System.out.println("it is a negative number");
                }
                else {
            System.out.println("number is odd number");
        }

    } else if (number%2==0) {

            if( number%10==0){
                System.out.println("it is multiple of 10");
            }
            else {
                System.out.println("it is not multiple of 10");
            }

        }

        }
    }
