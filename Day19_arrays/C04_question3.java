package Day19_arrays;

import java.util.Arrays;

public class C04_question3 {
    public static void main(String[] args) {


        int [] array= {4,5,6,7};
        System.out.println(Arrays.toString(changeValuemethod(array)));
    }

    public static  int [] changeValuemethod (int [] arrays){
      int a =arrays[arrays.length-1];
        int i = arrays.length-1;
       do{

            arrays[i]=arrays[i-1];
            i--;
       }
       while(i>=1);

arrays[0]=a;
        return arrays;
    }
}
