package Day14_Methodcreations;

public class C03_ReverseString {
    public static void main(String[] args) {
        String str="work hard, learn java and earn money";
        reverseString(str);
    }

    public static String reverseString( String a){

        String reverse="";
        for (int i =a.length()-1; i >=0 ; i--) {

            reverse= reverse+(a.substring(i,i+1));


        }
      //  System.out.print(reverse);

        return  reverse;
    }
}
