package exampleProject_Calculation;

public class calc {
    public static void main(String[] args) {
        Calculation hesap=new Calculation();
        hesap.setX(10);
        hesap.setY(6);
        hesap.plus();
        System.out.println(hesap.getResult());

        hesap.minus();
        System.out.println(hesap.getResult());
    }
}
