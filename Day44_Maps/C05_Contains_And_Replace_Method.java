package Day44_Maps;

import java.util.Map;

public class C05_Contains_And_Replace_Method {
    public static void main(String[] args) {
        Map<Integer,String> exampleMap=mapDepo.studentCreatorMethod();
        System.out.println(exampleMap);
        System.out.println(exampleMap.containsValue("Ali-Can-10-F-MF"));
        System.out.println(exampleMap.containsKey(111));
        System.out.println(exampleMap.get(101).contains("10"));
        //replacea
        System.out.println(exampleMap.replace(101, "Ali-Can-10-K-MF"));
        System.out.println(exampleMap);
        exampleMap.replace(102,"Veli-Can-10-A-MF","Osman-Kan-09-Y-MF");
        System.out.println(exampleMap);

    }
}
