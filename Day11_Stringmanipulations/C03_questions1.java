package Day11_Stringmanipulations;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class C03_questions1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter something");
        String str=scan.nextLine();


        if(str.contains("home") && str.contains("work")){
            System.out.println("you have home and work");
        }
        else if(str.contains("work")){
            System.out.println("good to work");
        }

       else if(str.contains("home")){
            System.out.println("home home sweet home");
        }
        else {
            System.out.println("you need to work");
        }
    }
}
