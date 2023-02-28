package Day20_arrayExamples;

import java.util.Arrays;

public class c02_arrayCreated {
    public static void main(String[] args) {
        int [] array= new int[5];
          array[0]=1;

          int [] array2={1,2,3};
          array2[1]=4;
        System.out.println(Arrays.toString(array) +"     "+ Arrays.toString(array2));
        System.out.println(c03_findingLowestAndHighest.lowestvalueInArray(array2));
        System.out.println(c03_findingLowestAndHighest.highestValueInArray(array2));


    }
}
