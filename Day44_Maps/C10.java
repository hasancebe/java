package Day44_Maps;

import java.util.List;
import java.util.Map;

public class C10 {
    public static void main(String[] args) {
        //öğrenci mapinde verilen numara aralığındaki öğrencilerin
        //isim soyisim ve bölümlerini yazdıralım (liste olarak)
        Map<Integer,String> studentMap=mapDepo.studentCreatorMethod();
        int startKey=101;
        int endKey=103;

        List<String> isimList=mapDepo.numaradegerineGoreListeOlustur(studentMap,startKey,endKey);
        System.out.println(isimList);
    }


}
