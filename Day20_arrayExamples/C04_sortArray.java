package Day20_arrayExamples;

import java.util.Arrays;
import java.util.Collection;

public class C04_sortArray {
    public static void main(String[] args) {


        int[]array ={2, 3, 6, 78, 65, 79, 71, 0, 74, 5} ;
      // Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int a= array[1];
        System.out.println(a);
        System.out.println(Arrays.binarySearch(array,5));


    }
}