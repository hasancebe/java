package Day44_Maps;

import java.util.HashMap;
import java.util.Map;

public class C04_putIfAbssentMethod {
    public static void main(String[] args) {
        Map<String,Integer>map1=new HashMap<>();
        map1.put("A",5);
        map1.put("B",6);
        map1.put("C",9);
        map1.putIfAbsent("D",8);
        System.out.println(map1);
        map1.putIfAbsent("A",5);
        System.out.println("*********");
        System.out.println(map1);
        System.out.println(map1.putIfAbsent("B", 6));
        System.out.println(map1.putIfAbsent("E", 7));// null yazar
        System.out.println(map1);
        System.out.println(map1.putIfAbsent("B", 8));// 6 yazar
        System.out.println(map1.putIfAbsent("E",10));//7 yazar
    }
}
