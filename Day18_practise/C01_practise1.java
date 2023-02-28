package Day18_practise;

import java.util.Scanner;

public class C01_practise1 {
    public static void main(String[] args) {
        Scanner scan2=new Scanner(System.in);

        System.out.println("please write the unit you want to convert: gallon or liter ");
        String str=scan2.nextLine();

        if(str.contains("gallon")) {
            System.out.println("please enter the gallon amount");
            Scanner scan=new Scanner(System.in);
            double gallon = scan.nextDouble();
            double lt = gallon * 3.78;
            System.out.println(gallon + " gallon=" + lt + " lt");

        }
         else if(str.contains("liter")) {
            System.out.println("please enter the liter amount");
            Scanner scan1=new Scanner(System.in);

            double lt1 = scan1.nextDouble();
            double gallon1 = 1/3.78;
            System.out.println(lt1 + " lt=" + gallon1 + " gallon");

        }
    }
}
