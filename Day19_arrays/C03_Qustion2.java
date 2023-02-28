package Day19_arrays;

public class C03_Qustion2 {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int [] array={10,-50,20,30,-40};
        int toplam= arrayadds(array);
        System.out.println(toplam);

    }
    public static int  arrayadds( int [] arrays){
                int adds=0;
        for (int i = 0; i < arrays.length; i++) {

            if(arrays[i]>0) {
                adds += arrays[i];
            }
        }
                return adds;

    }

}
