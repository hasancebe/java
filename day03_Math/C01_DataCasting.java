

package day03_Math;
import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {
       char chr1='a';
       char chr2= 'b';
        System.out.println('a' +'b');
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter char");
        char enterchar= scan.next().charAt(0);
        System.out.println("entered char = " + enterchar);
        System.out.println("" + (char) (enterchar+1)+ (char)(enterchar+2)+ (char)(enterchar+3));


    }

}
