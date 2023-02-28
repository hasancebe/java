package Day21_multiDimensionArray;

public class C02_evenValue_In_Array {
    //Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
    //method olusturun.
    public static void main(String[] args) {


        int[][] array = {{4, 5, 8, 9,},{10, 52, 55, 63, 7},{1, 3, 5, 9, 14, 18}};

        evenValueInArray(array);
    }
    public static void evenValueInArray(int [][] arrays){
        int evenTotal=0;

        for (int i = 0; i <arrays.length ; i++) {

            for (int j = 0; j <arrays[i].length ; j++) {
                 if(arrays[i][j]%2==0){
                     evenTotal+=arrays[i][j];
                 }
            }
        }
        System.out.println(evenTotal);
    }
}
