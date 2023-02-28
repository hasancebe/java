package Day44_Maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Compute {
    public static void main(String[] args) {
        //If there is C key İncrease yhe value

        Map<String,Integer>map1=new HashMap<>();
        map1.put("A",5);
        map1.put("B",6);
        map1.put("C",9);
        if(map1.containsKey("C")){
            map1.put("C",map1.get("C")+3);
        }
        System.out.println(map1);

        //If map does not have  D key add entery value D,11

            if (!map1.containsKey("D")) {
                map1.put("D", 11);
            }
            map1.compute("C",(k,v)->v+3);

        System.out.println(map1);
        map1.computeIfPresent("B",(k,v)->v*3);
        System.out.println(map1);
        map1.computeIfAbsent("E", v ->1);
        System.out.println(map1);
        map1.compute("L",(k,v)->v*5);
        System.out.println(map1);

    }
        }


