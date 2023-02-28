package Day34_Overriding_polimorfizim;

public class CClass extends BChild {
    public void method2(String a){
        System.out.println("cclass method");
    }
    public void method3 (String b){
        System.out.println("CClass method3");
    }
    public static void main(String[] args) {
        BChild obj=new BChild();
        obj.method2("a");
        CClass obj1=new CClass();
        obj1.method2("a");
        obj.method3("a");
        obj1.method3("a");

    }
}
