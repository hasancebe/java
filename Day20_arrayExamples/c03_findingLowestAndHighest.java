package Day20_arrayExamples;

public class c03_findingLowestAndHighest {
    public static void main(String[] args) {
        int[] array = {1, 6, 5, 7, 8, 9, 10, 5, 11, 5, 8,};
        int lowValue=lowestvalueInArray(array);
        int highValue = highestValueInArray(array);
        System.out.println(lowValue + " " + highValue);
    }

    public static int lowestvalueInArray(int[] array) {
        int lowest = array[0];


        for (int i = 0; i < array.length; i++) {



            if (lowest > array[i]) {
                lowest = array[i];
            }

        }
        return lowest;
    }

    public static int highestValueInArray(int[] array) {

        int highest = array[0];

        for (int i = 0; i < array.length; i++) {


            if (highest < array[i]) {
                highest = array[i];
            }


        }
        return highest;

    }
}