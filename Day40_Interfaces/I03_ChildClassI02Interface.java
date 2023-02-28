package Day40_Interfaces;

public class I03_ChildClassI02Interface implements I02_Interface, I04_Interface{


    @Override
    public void method1() {
        System.out.println("I will go to school");

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public String method4() {
        return null;
    }

    @Override
    public int method3() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I02_Interface.STR);
        System.out.println(I04_Interface.STR);
        System.out.println(NUM2);

    }
}
