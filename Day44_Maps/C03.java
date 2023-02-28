package Day44_Maps;

import java.util.Map;

public class C03 {
    public static void main(String[] args) {
        Map<Integer,String>studentMap=mapDepo.studentCreatorMethod();
        System.out.println(studentMap);
        studentMap.put(104,"Abdullah-Han-15-K-SOZ");
        System.out.println(studentMap);

        //103 nolu öğrencinin isim soyisimini yazdır
        String nameSurname=mapDepo.nameSurnameWrite(studentMap, 103);
        System.out.println(nameSurname);
        studentMap.replace(101,"berkant-olur-12-D-SOZ");
        System.out.println(studentMap);
    }
}
