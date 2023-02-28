package Day22_ArrayLıst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {
        int [] array={10,20,30,40};
        List <Integer> arraylist= new ArrayList<>();
        List <String> arraylist1= new ArrayList<>();
        arraylist1.add("hasan");
        arraylist1.add("cebe");
        arraylist.add(10);

        arraylist.add(55);
        arraylist.add(45);
        System.out.println(arraylist);
       // System.out.println(arraylist.remove(0));
        Collections.sort(arraylist);
        Collections.sort(arraylist1);

        System.out.println(arraylist);
        System.out.println(arraylist1);
       // int a=array[0];
       // arraylist.remove(a);

       // System.out.println(arraylist);


    }
}
