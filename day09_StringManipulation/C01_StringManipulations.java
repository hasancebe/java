package day09_StringManipulation;


import java.util.Locale;

public class C01_StringManipulations {
    public static void main(String[] args) {


    String str="Java is good";
        System.out.println(str.toUpperCase(Locale.ROOT));
        str=str.toUpperCase(Locale.ROOT);
        System.out.println(str);
        System.out.println(str.toLowerCase());
}}
