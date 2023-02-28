package Day01_practise;

import java.util.Scanner;

public class C07_scanner2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //lets name surname, age hight, hair, where are you from....

        System.out.println("please enter yor name and surname");
        String nameandsurname= scan.nextLine();


        System.out.println("please enter your age");
        int age= scan.nextInt();

        System.out.println("please enter your hight(cm)");
        double hight=scan.nextDouble();

        System.out.println("please enter your homeland");

        String homeland=scan.next();

        System.out.println("name and surname "+nameandsurname);
        System.out.println("age "+ age);
        System.out.println("hight "+ hight);
        System.out.println("homeland "+ homeland);

    }
}
