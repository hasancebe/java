package Day34_Overriding_polimorfizim;

public class BChild extends Aparent{
    public void method1(){
        System.out.println("BChild method1");
    }
    public void method2(String a){

        System.out.println("BChild method2");
    }
    public void method3 (String b){
        System.out.println("BChild method3");
    }

    public static void main(String[] args) {
        BChild obj=new BChild();
        obj.method1();
        obj.method2("hasan");
    }

}

