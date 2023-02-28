package Day44_Maps;

import java.util.Map;

//öğrencinin subesini  'F'ise isim soyisim ve sınıflarını yazdıran kod.
public class C09 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap=mapDepo.studentCreatorMethod();
        /*Set<Integer> studentKey=students.keySet();
        Collection<String> studentValueCollection=students.values();
       /* System.out.println(students);
        System.out.println(studentValueCollection.size());
        studentValueCollection.contains("G");*/
        String sube="F";
        mapDepo.writingStudentValues( studentMap, sube);

        //System.out.println(studentKey);
    }
}
