package Day14_Methodcreations;

import java.util.Locale;

public class C05_Stringilkharfibuyukyapma {
    public static void main(String[] args) {
        String str1 = "hasan";
        String str2 = "cebe";
processName(str1,str2);

    }
        public static void processName(String name, String lastname) {

            System.out.println(name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1).toLowerCase()
            +" "+ lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase());

        }

    }

