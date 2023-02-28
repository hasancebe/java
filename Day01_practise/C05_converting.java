package Day01_practise;

import java.util.Scanner;

public class C05_converting {
    public static void main(String[] args) {
        //changes km to meter
        Scanner scan= new Scanner(System.in);
        System.out.println("km bilgisi giriniz");
        double km=scan.nextDouble();
        double meter=km*1000;
        System.out.println("girilen değer "+ meter+ "m\'dir");
    }
}
