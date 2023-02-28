package Day13_practise;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a day");
        String day= scan.next().toUpperCase();
        switch (day){
            case "MONDAY":
            case "TUESDAY":
                System.out.println("java day");
                break;
                case "THURSDAY" :
                case "FRIDAY":
                    System.out.println("seleniom day");
                        break;
            case "WEDNWSDAY":
            case"SATURDAY":
                System.out.println("SQL DAY");
                break;
            case"SUNDAY":
                System.out.println("holiday");
                break;
            default:
                System.out.println("day off");
    }
}}
