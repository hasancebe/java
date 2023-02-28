package Day44_Maps;

import java.util.*;

public class mapDepo {


    public static Map<Integer,String>studentCreatorMethod(){

    Map<Integer,String> studentCreatorMap=new HashMap<>();

        studentCreatorMap.put(101, "Ali-Can-10-F-MF");
        studentCreatorMap.put(102, "Veli-Can-10-A-MF");
        studentCreatorMap.put(103, "Ahmet-Cim-10-H-MF");
        studentCreatorMap.put(105, "Hasan-Can-101-G-TM");
        studentCreatorMap.put(106, "Ali-Cem-101-F-TM");

    return studentCreatorMap;

}

    public static String nameSurnameWrite(Map<Integer, String> studentMap, int sudentKey) {

        String sudentValue=studentMap.get(sudentKey);
        String[] arrayValue=sudentValue.split("-");
        String nameSurname=arrayValue[0]+ " "+ arrayValue[1];
        return nameSurname;
    }



    public static void writingStudentValues(Map<Integer, String> studentMap, String sube){
        Collection<String> valueCoolection=studentMap.values();

        for (String eachValue:valueCoolection
             ) {
            String[]valueCollectionArray=eachValue.split("-");
            if(valueCollectionArray[3].equalsIgnoreCase(sube)){
                System.out.println(valueCollectionArray[0]+" "+ valueCollectionArray[1]+ " "+valueCollectionArray[2]);
            }
        }
    }

    public static List<String> numaradegerineGoreListeOlustur(Map<Integer, String> studentMap, int startPoint,
                                                              int endPoint) {
        Set<Integer> studentKeyValue=studentMap.keySet();
        //Collection<String>studentValueColl=studentMap.values();
        List<String>nameList=new ArrayList<>();
        String value;
        String [] valueArray;
        String wantedName;
        for (Integer eachKey:studentKeyValue
             ) {
            if(startPoint<=eachKey&&eachKey<=endPoint ){
                value=studentMap.get(eachKey);
                valueArray=value.split("-");
                wantedName=valueArray[0]+" "+valueArray[1]+" "+valueArray[4];
                nameList.add(wantedName);}


        }
        return nameList;

    }
}
