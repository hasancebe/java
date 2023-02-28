package DAY04calisma;

public class C_03_increments {
    public static void main(String[] args) {
        int x=3;
        int y=3*++x;
        int z=5+y--;
        System.out.println(z);
        System.out.println(y);
        System.out.println(x+y+z);
    }
}
