package Day21_multiDimensionArray;

public class C05_totalLastValue {
    //Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
    //toplaminini yazdiran bir method olusturun.
    public static void main(String[] args) {
        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        System.out.println(lastTotal(arr));
    }
        public static int lastTotal(int[][]arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {

                total+=arr[i][arr[i].length-1];

        }
       return total;
    }
}
