package Day41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
//yaziniz . (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
//Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
//output: [23,40]
public class C02 {
    public static void main(String[] args) {
        List <Integer> list=new ArrayList<>();
        list.add(2); list.add(13); list.add(20); list.add(23); list.add(45); list.add(14); list.add(40); list.add(12);
        ListIterator lt1= list.listIterator();


        System.out.println(list);
        while(lt1.hasNext()){
            Integer value=(Integer) lt1.next();
            if(value<=40&&value>=20){
                lt1.remove();
                //System.out.println(lt1.previous());

            }
        }
        System.out.println(list);
    }
}
