package Day41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
public class C03 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2); list.add(13); list.add(20); list.add(23); list.add(45); list.add(14); list.add(40); list.add(12);
        ListIterator lt1= list.listIterator();

        while(lt1.hasNext()) {
            lt1.next();
        }
        while (lt1.hasPrevious()) {

            System.out.print(lt1.previous()+ ",");
        }
        }

    }

