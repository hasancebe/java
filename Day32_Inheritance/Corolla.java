package Day32_Inheritance;

public class Corolla extends BToyota {
    public Corolla(int i) {
        super(5);
        System.out.println("corolla cons with parameters");
    }
    Corolla(){

        System.out.println("corolla cons without parameters");
    }
    Corolla (String str){
        this();
        System.out.println("Corolla cons with string parameters");
    }

    public static void main(String[] args) {
        Corolla car1=new Corolla();
        System.out.println("*******************");
       BToyota car=new BToyota("hasan");
        System.out.println("*******************");
        BToyota btoy1=new BToyota(4);
        System.out.println("*******************");
        Corolla car2=new Corolla(5);
        System.out.println("*******************");
        Corolla car3=new Corolla("str");


    }
}
