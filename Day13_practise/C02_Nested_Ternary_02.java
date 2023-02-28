package Day13_practise;

import java.util.Scanner;

public class C02_Nested_Ternary_02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a word");
        char letter= scan.next().charAt(0);
        String str=(letter=='A'? ("very sucsessfull") : (letter=='B')? "Successful":
                (letter=='C')?"just enough":("others.."));
        System.out.println(str);

    }
}
