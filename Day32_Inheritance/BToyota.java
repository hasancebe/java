package Day32_Inheritance;

public class BToyota extends ACar {
    BToyota(){
        System.out.println("BToyota cons run, without parameters");
    }
    BToyota(int a){
        System.out.println("BToyota cons with  int parameters");
    }

    BToyota(String a){
        super("str");
        System.out.println("BToyota cons with  String parameters");
    }

}
