package Day28_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {

        add(1);
      add(2,3,4.5);
     add(2,3,6);
        add(4,5,6,9);
        add(10,11,12,45,63,88,77);
    }


    public static void add(double... number1){
       double total=0;
        for (double each: number1
             ) {
            total+=each;
        }
        System.out.println(total);
    }
}
