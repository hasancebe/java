package Day28_Varargs;

public class C02_varargs {
    //create a method that calculates total of numbers except the first number
    //then multiply total value by the first number
    public static void main(String[] args) {
        method1(3,4,5,6,9,8,7,10);
    }
    public static void method1(int firstnumber,int... numbers){
        int total=0;
        for (int each:numbers
             ) {
            total+=each;
        }
        System.out.println(firstnumber*total);
    }
}
