package Day15_Methodoverloading;

import java.util.Scanner;

public class C03_whileLoopSifre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sorgula=false;
int flag=0;
        while (!sorgula){
            flag=0;
            System.out.println("please enter password");
            sifre=scan.nextLine();

            if(!(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z')){
                System.out.println("first letter should be a lowercase");
                //sorgula=false;
            flag ++;
            }

              if(!((sifre.charAt(sifre.length()-1)>='0') && (sifre.charAt(sifre.length()-1)<='9'))){

                System.out.println("last char should be a number");
               // sorgula=false;
flag++;
            }

              if(flag==0) {

                System.out.println("password saved");
                sorgula=true;

            }
        }
    }
}
