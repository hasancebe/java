package odevsorulari2;
//Find maxGiven an array **num**, get the max number in the array and print it out to the console.```
//nums → [2, 4, 2, 3, -2]) → 4
//nums → [2, 2, 5, 3, 0 ]) → 5
//nums → [1, 33, 5, 7, 9]) → 33
public class Question8 {

    public static void main(String[] args) {

int array[]={1, 33, 5, 7, 9};
        int highest = array[0];
        for (int i = 0; i < array.length; i++) {

            if (highest < array[i]) {
                highest = array[i];
            }
        }
        System.out.println(highest);
    }
}
