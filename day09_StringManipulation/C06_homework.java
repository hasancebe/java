package day09_StringManipulation;

import java.util.Scanner;
// QUESTION STRING MANIPULATIONS
public class C06_homework {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter mail adress");
    String email= scan.nextLine();

        boolean a=email.contains("@");
        boolean b=email.contains("@gmail.com");
        boolean c= email.endsWith("@gmail.com");



        if(a!=true){
           System.out.println("invalid mail adress");
       }

        if(b!=true){
            System.out.println("mail adress must be g-mail");
        }

        else if(c!=true){
            /*son satıra else yazmamın sebebi, gmail olmayan
             mail girildiğinde sadece ikinci uyarıyı veriyor*/
            System.out.println("there is a typo in mail adress");
        }
        else{
            System.out.println("your mail adress saved");
        }
    }
}
