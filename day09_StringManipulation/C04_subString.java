package day09_StringManipulation;

import java.util.Locale;

public class C04_subString {
    public static void main(String[] args) {
        String str="java is beatiful";
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(2,5).toUpperCase(Locale.ROOT));
        System.out.println(str.length());


    }
}
