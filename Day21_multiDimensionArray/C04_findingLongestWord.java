package Day21_multiDimensionArray;

public class C04_findingLongestWord {
    public static void main(String[] args) {
        String[][]array ={{"mehmet","ali","abdullah"},{"ömer","faruk","ömer faruk"},{"can","abdulmuttalip"}};
        String longestWord=array[0][0];
        String shortestWord=array[0][0];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {

                if(longestWord.length()<array[i][j].length()){
                    longestWord=array[i][j];
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {

                if(shortestWord.length()>array[i][j].length()){
                    shortestWord=array[i][j];
                }
            }
        }
        System.out.println(longestWord + " " +shortestWord);
    }
}
