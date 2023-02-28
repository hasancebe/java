package Day44_Maps;

import java.util.TreeMap;

public class c07_treeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> mapTree1=new TreeMap<>();
        mapTree1.put("A",11);
        mapTree1.put("Y",51);
        mapTree1.put("C",31);
        mapTree1.put("D",1);
        System.out.println(mapTree1);
        mapTree1.put("F",45);
        System.out.println(mapTree1);
        System.out.println(mapTree1.size());
        System.out.println(mapTree1.ceilingEntry("T"));
        System.out.println(mapTree1.higherEntry("D"));
        System.out.println(mapTree1.higherKey("D"));
        System.out.println(mapTree1);
        System.out.println(mapTree1.floorEntry("E"));
        System.out.println(mapTree1.floorEntry("B"));
        System.out.println(mapTree1.ceilingEntry("B"));
        System.out.println("****************");
        System.out.println(mapTree1);
        System.out.println(mapTree1.headMap("D"));
        System.out.println(mapTree1.headMap("M"));


    }
}
