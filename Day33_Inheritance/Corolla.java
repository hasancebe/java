package Day33_Inheritance;

public class Corolla extends BToyota {
    String model="Corolla";
    String madeIn="turkey";
    int year=2003;
    public void hiz(){
        System.out.println("benzinli araçlar  corolla sınıfında hızlıdır.");
    }

    public static void main(String[] args) {

        Corolla car1=new Corolla();
        System.out.println(car1.model);
        System.out.println(car1.madeIn);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.fuel);
        System.out.println(car1.motor);
        System.out.println(car1.plate);
        car1.hiz();

        System.out.println("*******************************");
        BToyota car2=new Corolla();
       // System.out.println(car2.model);
        System.out.println(car2.madeIn);
        System.out.println(car2.color);
        System.out.println(car2.fuel);
        System.out.println(car2.motor);
        System.out.println(car2.plate);
        car2.hiz();
        System.out.println("********************");

        ACar car3=new Corolla();
        //System.out.println(car3.model);
       // System.out.println(car3.madeIn);
        //System.out.println(car3.year);
       // System.out.println(car3.color);
        System.out.println(car3.fuel);
        System.out.println(car3.motor);
        System.out.println(car3.plate);

        System.out.println("********************************");
        BToyota car4=new BToyota();
        //System.out.println(car4.model);
        System.out.println(car4.madeIn);
        //System.out.println(car4.year);
        System.out.println(car4.color);
        System.out.println(car4.fuel);
        System.out.println(car4.motor);
        System.out.println(car4.plate);
        System.out.println("**************************");

        ACar car5=new BToyota();
        //System.out.println(car5.model);
        //System.out.println(car5.madeIn);
        //System.out.println(car5.year);
        //System.out.println(car5.color);
        System.out.println(car5.fuel);
        System.out.println(car5.motor);
        System.out.println(car5.plate);



    }
}
