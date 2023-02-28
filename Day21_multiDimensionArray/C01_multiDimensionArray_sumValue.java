package Day21_multiDimensionArray;

import java.util.Arrays;

public class C01_multiDimensionArray_sumValue {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(array[1]));
        sumArrayValue(array);


    }

    public static void sumArrayValue(int[] [] arrays) {
            int total_value=0;

        for (int i = 0; i <arrays.length ; i++) {

            for (int j = 0; j < arrays[i].length; j++) {
                total_value +=arrays [i][j];
            }
        }
        System.out.println(total_value);

    }

}

