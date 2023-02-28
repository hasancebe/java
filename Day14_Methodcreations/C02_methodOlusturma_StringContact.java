package Day14_Methodcreations;

public class C02_methodOlusturma_StringContact {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="Can";
        System.out.println(stringContact(str1, str2));



    }
    public static String stringContact(String st, String sr){
        String result= st + " "+ sr;

        return result;
    }
}
