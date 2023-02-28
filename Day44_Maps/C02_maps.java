package Day44_Maps;

import java.util.Map;

public class C02_maps {
    public static void main(String[] args) {
        Map<Integer,String>studentMap=mapDepo.studentCreatorMethod();
        System.out.println(studentMap);
        System.out.println(studentMap.get(101));
        //isim soyisim yazdıran method oluştur
        int sudentKey=101;
        String nameSurname= mapDepo.nameSurnameWrite(studentMap, sudentKey);
        System.out.println(nameSurname);
    }
}
