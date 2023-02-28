package Day22_ArrayLıst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Qustion2Arraylist {


    //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
    //liste olarak dondurecek bir method olusturun.
    public static void main(String[] args) {


        List <String> nameList= new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        String name="";
        while (!name.equalsIgnoreCase("q")){
            System.out.println("please enter name for list and will finished press 'Q'");
            name= scan.nextLine();

            if(!name.equalsIgnoreCase("q")){
                nameList.add(name);
            }
        }
        System.out.println(nameList);
    }
}
