package Day29_StringBuilderDateFormat;

public class C02_StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder(22);
        StringBuilder str2=new StringBuilder(22);
        StringBuilder str3=new StringBuilder(22);
        str1.append("filiz beyza");
        str2.append("lfiliz beyza");
        System.out.println(str1.capacity());
        System.out.println(str1.length());
        str1.trimToSize();
        System.out.println("kapasite - "+str1.capacity()+ " length -"+ str1.length());

        System.out.println("***********************");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.toString().contains("fil"));
    }
}
