package Day14_Methodcreations;

public class C06_lastChardontwrite {
    public static void main(String[] args) {
        String str = "hasan";
        lastChardontwrite(str);

    }

    public static void lastChardontwrite(String str){
        String lastcahrout=str.substring(0,str.length()-1);
        //String lastcahrout1 = lastcahrout;
        System.out.println(lastcahrout);

    }
}
