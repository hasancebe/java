package Day21_multiDimensionArray;

import java.util.Arrays;

//Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
//olusturacagimiz tek katli bir array’e bu toplamlari atayin.
//input : int[][] arr = {{3,4,5}, {2,3,6,7}};
//output: [5, 7, 11]
public class C06_sumAndcombiningArary {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5}, {2,3,6,7},{5,6,8,9,10}};


        int arraylenght=arr[0].length;
        for (int i = 1; i <arr.length ; i++) {

            if(arraylenght>arr[i].length)
                arraylenght=arr[i].length;

        }
        int [] newArray= new int[arraylenght];

       // int[][] arr = {{3,4,5}, {2,3,6,7}};
        for (int i = 0; i <newArray.length ; i++) {
            int toplam=0;

                toplam=arr[0][i]+arr[1][i]+arr[2][i];

            newArray[i]=toplam;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
