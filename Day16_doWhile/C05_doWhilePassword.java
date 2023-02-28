package Day16_doWhile;

import java.util.Scanner;

public class C05_doWhilePassword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter password");
        String password="";
int count=0;
        do{
            password= scan.next();
            for (int i = 0; i <password.length()-1 ; i++) {

                if(!(password.charAt(i)>='a'&& password.charAt(i)<='z')){
                    System.out.println("password must be contain lowercase letter");
                    count ++;
                    break;
                }
               else if(!(password.charAt(i)>='A'&& password.charAt(i)<='Z')){
                    System.out.println("password must be contain uppercase letter");
                    count++;
                    break;
                }

            }



        }while(count!=0);
        System.out.println("password saved");
    }
}
