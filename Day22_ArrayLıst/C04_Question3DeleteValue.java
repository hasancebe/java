package Day22_ArrayLıst;

import java.util.ArrayList;
import java.util.List;

public class C04_Question3DeleteValue {
    //Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
    //kismini list olarak bize donduren bir method olusturun
    public static void main(String[] args) {


        List<String> nameList = new ArrayList<>();
        nameList.add("ali");
        nameList.add("ahmet");
        nameList.add("veli");
        nameList.add("latif");
        nameList.add("mehmet");
        System.out.println(nameList);
        List<String>newList=new ArrayList<>();
        for (int i = 0; i <nameList.size() ; i++) {
            if(!nameList.get(i).contains("a")){
                newList.add(nameList.get(i));
            }
        }
        System.out.println(newList);
    }
}