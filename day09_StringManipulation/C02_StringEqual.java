package day09_StringManipulation;

public class C02_StringEqual {
    public static void main(String[] args) {
        String str1="hasan";
        String str2="Hasan";
        String str3= new String("hasan");
        String str4="HASAN";

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

    }
}
