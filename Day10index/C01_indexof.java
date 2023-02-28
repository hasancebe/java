package Day10index;

public class C01_indexof {
    public static void main(String[] args) {
        String str="java3 is good java is good clear";

        System.out.println(str.indexOf("ava"));
        System.out.println(str.indexOf("is",1));
        System.out.println(str.indexOf(3));
        System.out.println(str.indexOf("hasan"));
        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("a",2));
        System.out.println(str.indexOf("a",0));
        int a= str.indexOf("g");
        System.out.println(a);
        System.out.println(str.indexOf("g",a+1));

    }
}
