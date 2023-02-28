package Day15_Methodoverloading;

public class C01_methodOverloading {
    public static void main(String[] args) {
        multiplacitaion(3,4);
        multiplacitaion(3,4,5);
        multiplacitaion(3.3,5);
        System.out.println(multiplacitation(7,8));
    }

    public static void multiplacitaion(int num1, int num2){

        System.out.println(num1*num2);
    }

    public static void  multiplacitaion(int num1, int num2, int num3){
        System.out.println(num1*num2*num3);
    }

    public static void  multiplacitaion(double num1, int num2){
        System.out.println(num1*num2);

    }
    public static int multiplacitation(int num1, int num2){
        return num1*num2;
    }
}
