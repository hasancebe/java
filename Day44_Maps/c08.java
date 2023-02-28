package Day44_Maps;

import java.util.*;

public class c08 {
    public static void main(String[] args) {

        String film=filmName.filmNameCreator();
        String [] arrayWord=film.split("");


        Map<Integer, String> map2 = new HashMap<>();//film karakteri kadar "_" yazdırmak için kullanılacak
        for (int i = 0; i < film.length(); i++) {
            map2.put(i, "_");
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("haydi filmi bulalım");

        System.out.println(map2.values());//"_,_,_,_,_,_,_" yazar
        String bil;
        int count=map2.size()+3;
        boolean finish=true;

    do {
        System.out.println("harf giriniz veya tahminde bulununuz");
        bil = scan.next();
        if(bil.length()==1){ //kullanıcı sadece harf girerse bu blok çalışır

        for (int j = 0; j < arrayWord.length; j++) {
            if (bil.equalsIgnoreCase(arrayWord[j]))
                map2.replace(j, "_", bil);

        }
        count--;
        System.out.println(map2.values());}
        else{// kullanıcı direk tahminde bulunursa bu blok çalışır.
            if(bil.equalsIgnoreCase(film)){
                System.out.println("**********tebrikler*************");
            finish=false;
            break;
            }
            count--;
            System.out.println(map2.values());

        }

        System.out.println(count + "hakkınız kaldı");
    } while(map2.containsValue("_")&&count>0); // filmi gizleyen map'te "_" karakteri olduğu  veya hakkı olduğu sürece
        // sormaya devam edecek

            if(finish==true){
        if (map2.containsValue("_")) System.out.println("üzgünüm bilemediniz");
        else System.out.println("**********tebrikler*************");}


        System.out.println(film.toUpperCase(Locale.ROOT));
        }

    }
