package day12_forloops;

public class C05_calisma {
    public static void main(String[] args) {
        // bir loopu sonunu beklemeden bitirmek
        // asal sayı olup olmadığını kontrol eden kod
         int sayi=16698;
int bayrak=0;
        for (int i = 2; i <=sayi-1 ; i++) {
             if(sayi % i ==0){
                bayrak ++;
                 //System.out.println("sayı asal değil");
                 break;

             }
             }
        if (bayrak==0){

        System.out.println("sayı asal ");
        }
        else{
            System.out.println("asal değil");
        }
    }}

