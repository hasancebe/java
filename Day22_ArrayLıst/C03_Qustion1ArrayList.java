package Day22_ArrayLıst;

import java.util.ArrayList;
import java.util.List;

public class C03_Qustion1ArrayList {
    //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
    //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun

    public static void main(String[] args) {
        List<Integer> numberList= new ArrayList<>();
        int[] array={1,2,3,5,2,3,6,7,8,1,4,5,6,5,4};

        for (int i = 0; i <array.length ; i++) {
            numberList.add(array[i]);
        }
        System.out.println(numberList);

        System.out.println(uniqeList(numberList));
    }
    public static  List<Integer>uniqeList(List<Integer>numberList){

        List<Integer>uniqList=new ArrayList<>();
        for (int i = 0; i <numberList.size() ; i++) {
            if(!uniqList.contains(numberList.get(i))){
                uniqList.add(numberList.get(i));
            }
        }
        return uniqList;
    }
}
