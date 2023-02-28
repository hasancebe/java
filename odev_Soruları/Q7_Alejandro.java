package odev_Soruları;

import java.util.Locale;
import java.util.Scanner;
//Alejandro has many emails and only has time to read the emails that refer to him. Check if his name is found in the email and if it does print "read", but if his name is not in the email print "don't read"Examples:```
//a = "dear alejandro.....alot of text"output: "read"

//a = "thunder blaz is the best drink in the galaxy..."output: "don't read"

//a = "subject : important project, alejandro we refer to you  this ...."output: "read"

public class Q7_Alejandro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a mail");
        String mail=scan.nextLine();
        String a="Alejandro";
        if(mail.contains(a)||mail.contains(a.toLowerCase(Locale.ROOT))||mail.contains(a.toUpperCase())){
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }


    }
}
