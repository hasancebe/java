package odevsorulari2;
//Average TemperatureGiven an array **temps** with temperature
// values find and print the average valueExample:```
//input: 80 88 88 84 82 78 60 68output: 78.5
public class Question7 {
    public static void main(String[] args) {


        int [] arrays={10,50,20,30,40};
        int toplam=0;
        double average;
        for (int i = 0; i < arrays.length; i++) {

            toplam += arrays[i];
        }
        average=toplam/ arrays.length;
        System.out.println(average);
    }

}


