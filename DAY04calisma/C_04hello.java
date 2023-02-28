package DAY04calisma;

public class C_04hello {
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        String c= " ";
        int e=3;
        int d=5;
        System.out.println(a+c+b);
        System.out.println(e+d+ a+c+b );
        System.out.println(a+b);
        System.out.println(a+ "   "+b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(a+e+d);
        System.out.println(e+d+a);
        System.out.println(a+e*d);

    }
}
