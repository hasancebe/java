package Day41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);
        ListIterator it1= list.listIterator();
        System.out.println(it1.hasNext());
        while(it1.hasNext()){
             it1.set((Integer)it1.next()+5);
        }
        System.out.println(list);

        //it1.next();
        //it1.next();
        it1.remove();
        System.out.println(list);


    }
}
