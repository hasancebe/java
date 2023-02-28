package Day20_arrayExamples;

import java.util.Arrays;

public class C01_arrayExamples_AddToArrayNewValue {
    public static void main(String[] args) {
        int [] array={10,20,30};
        int added=40;
        System.out.println(Arrays.toString(array));
        array=araryChange(array,added);
        System.out.println(Arrays.toString(array));
    }
    public static int [] araryChange(int[] arrays, int addednumber){

        int [] newArray = new int[arrays.length+1];
        for (int i = 0; i <arrays.length ; i++) {
            newArray[i]=arrays[i];

        }
        newArray[newArray.length-1]= addednumber;
        return  newArray;
    }
}
