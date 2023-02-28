package Day28_Varargs;

public class varargsExample {
    public static void main(String[] args) {
        topla(3, 4, 5, 6);
        topla(2, 4);
        yazdir(4,"hasan");
        yazdir(3,"hasan","cebe");
        yazdir(2,"hasan", "cebe,","tugba");

    }

    public static void topla(int a, int... b) {
        int toplam = 0;

        for (int each : b
        ) {
            toplam += each;

        }
        System.out.println(toplam);
        System.out.println(toplam - a);


    }

    public static void yazdir(int a, String... str) {
        while (a > 0) {
            for (String each : str
            ) {
                System.out.print(each+ "***");

            }
            System.out.println("=============");
            a--;
        }
    }
}