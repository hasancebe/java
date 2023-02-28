package odev_Soruları;

import java.util.Scanner;

//Email 2Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.Example:```
//Input: craig_federighi@apple.com```
//Output:
//First name: Craig
//Last name: Federighi
//Domain: apple

public class Q8_e_mail {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your e-mail");
        String e_mail=scan.nextLine();
        String name="";
        String surname="";
        String domain="";

        for (int i = 0; i <e_mail.length() ; i++) {
            if(e_mail.charAt(i)=='_'){
                name=e_mail.substring(0,i);
                name=name.substring(0,1).toUpperCase()+name.substring(1);

                for (int j = i; j <e_mail.length(); j++) {
                    if(e_mail.charAt(j)=='@') {
                        surname = e_mail.substring(i + 1, j);

                        for (int k = j; k < e_mail.length(); k++) {
                            if (e_mail.charAt(k) == '.') {
                                domain = e_mail.substring(j + 1, k);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Firstname "+name);
        System.out.println("Lastname "+surname);
        System.out.println("domain "+domain);
    }
}
