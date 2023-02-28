package Day13_practise;

public class C06_name {
    public static void main(String[] args) {
        String name= "hasanl";
        String surname="cebe";
String str= "C";
        //System.out.println(str.startsWith("a",3));
       // System.out.println(str.substring(2,2));
        System.out.println(str.contains("h"));
        System.out.println(str.indexOf("h"));
        String a="Ali 12 ?_";
        System.out.println();
    if(name.length()%2==0){
        System.out.println(name.substring(0,name.length()/2)+surname+name.substring(name.length()/2));
    }
    }
}
