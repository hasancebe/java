package Day11_Stringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_questions05 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter your name");
        System.out.println("please enter your  surname");

        String name=scan.next();
        String surname=scan.next();

        if(name.length()>surname.length()){
            System.out.println(name.substring(0,1).toUpperCase(Locale.ROOT)+ name.substring(1).toLowerCase()+
                    " "+ surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase());

        } else if (name.length()<surname.length()) {
            System.out.println(name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1).toLowerCase()+
                    " "+ surname.toUpperCase());

        }
    }
}
