package Day32_Inheritance;

public class DCamry extends BToyota{

    DCamry(String str){
    super("Sea");
        System.out.println("DCamry cons with  string parameters");
    }
    DCamry(){}

    public static void main(String[] args) {
        //DCamry car2=new DCamry();
      DCamry car3=new DCamry("str");


    }
}
