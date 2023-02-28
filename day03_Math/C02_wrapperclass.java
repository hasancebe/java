package day03_Math;

public class C02_wrapperclass {
    public static void main(String[] args) {
        int sayi1=5;
        Integer sayiw=6;
        sayi1=sayiw;
        sayiw=sayi1;
       String yazi="125";
        //Integer i= new Integer(5);
       //i=5;
       // int sayi = Integer.highestOneBit(10);
        int rakam=10;
        Integer yenirakam= new Integer(65);
        int a= yenirakam.hashCode();
        System.out.println(yenirakam+ a);
       /* System.out.println(sayi);
        System.out.println(yazi);
        System.out.println(i);*/
       // System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(sayi1);

    }
}
