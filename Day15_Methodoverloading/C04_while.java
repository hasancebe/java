package Day15_Methodoverloading;

import java.util.Scanner;

public class C04_while {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int totalNumber=0;
        int number=1;
int count=0;
        while(number!=0){
            System.out.println("please enter a number to add and  press 0 see the result");
            number= scan.nextInt();

            if(number<0){
                System.out.println("you should not enter a negative number");
                totalNumber=totalNumber-number;
                count--;
            }
            totalNumber= totalNumber+number;
            count++;

        }
        System.out.println("girilen sayı adedi=" +(count-1)+ " toplam sayı= " +totalNumber);
    }
}
