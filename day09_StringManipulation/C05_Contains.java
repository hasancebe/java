package day09_StringManipulation;

public class C05_Contains {
    public static void main(String[] args) {
        String str="java is good";
         String str1=" java is the best";
        System.out.println(str.contains("ava"));
        System.out.println(str.contains(" "));
        System.out.println(str.contains(""));
        System.out.println(str.contains("  "));
        System.out.println(str.concat(str1));
        System.out.println(str.concat(str1.substring(2,6)));
        System.out.println(str.startsWith("java"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.contains("ja"));
        System.out.println(str.endsWith("good"));
        System.out.println(str.endsWith("good "));
        System.out.println(str.endsWith(""));

    }
}
