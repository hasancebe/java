package Day18_practise;

import java.util.Scanner;

public class C02_practise {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How old are you ");
        int age =scan.nextInt();
        if(age<18)
            System.out.println("you do not drink");
        else if(age>=18 && age<60)
            System.out.println("you can drink one glass");
        else if(age>=60 &&  age<70)
            System.out.println("you can drink just 3 glasses");
        else if (age>=70)
            System.out.println("you can drink just 4 glasses");


    }
}
