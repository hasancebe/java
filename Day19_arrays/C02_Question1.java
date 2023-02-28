package Day19_arrays;

import java.util.Arrays;

public class C02_Question1 {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};

       // System.out.println(array2plus(arr));
        System.out.println(Arrays.toString(array2plus(arr)));
    }
    public static int [] array2plus(int [] array){

        for (int i = 0; i <array.length ; i++) {
            array[i]=array[i]+2;



        }
       // System.out.println(Arrays.toString(array));
        return array;

    }
}
