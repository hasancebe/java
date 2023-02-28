package Day44_Maps;
// create a program that counts the letters any gives an output like this(case sensitive)
//J=1, a=8, c=3
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        String str="I love Java because It is the best";
        //I=2, l=1.....
        Map <String, Integer>  numberOfLetters=new HashMap<>();

        String [] letters=str.split("");
        System.out.println(Arrays.toString(letters));
       /* int count=1;
        for (int i = 0; i <letters.length ; i++) {

            if(numberOfLetters.containsKey(letters[i])) {
                continue;
            }else{

            for (int j = i+1; j < letters.length ; j++) {


                if(letters[i].equalsIgnoreCase(letters[j])){
                    count++;

                }
            }
            numberOfLetters.put(letters[i], count );
               // System.out.print(count+"----"+ letters[i]+ "*   ");
               // System.out.println();
            count=1;
        }}
        System.out.println();
        System.out.println(numberOfLetters);

        Set<String> keyset=numberOfLetters.keySet();
        System.out.println(keyset);*/

        for (int i = 0; i <letters.length ; i++) {


            numberOfLetters.computeIfPresent(letters[i],(k,v)->v+1 );
            numberOfLetters.putIfAbsent(letters[i],1 );
            //{ =8, a=4, b=3, c=2, e=6, h=2, I=3, i=2, J=2, l=2, o=2, s=4, t=4, u=2, v=3}
            // { =7, a=3, b=2, c=1, e=5, h=1, I=2, i=1, J=1, l=1, o=1, s=3, t=3, u=1, v=2}

        }
        System.out.println(numberOfLetters);

    }
}
