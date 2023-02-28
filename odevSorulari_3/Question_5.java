package odevSorulari_3;
//Complete the method **isPalindrome()** that will check if number is a palindrome.
// Print your result as a boolean (true or false).
//> Challenge: Do not convert int into a string!Examples:```
//input: 1001output: true
//``````
//input: 1234output: false

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        System.out.println(isPalindrome());

    }
        public static boolean isPalindrome(){
        boolean isPalindrome;
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scan.nextInt();
        int newNumber=0;
        int modules=0;
        int reverseNumber=0;
        newNumber=number;

        while(number>0){
            modules=number%10;
            reverseNumber=(reverseNumber*10)+modules;
            number=number/10;

        }//the purpose of the while loop to find of reverse the number entered by the user
        /*System.out.println(number);
        System.out.println(newNumber);
        System.out.println(reverseNumber);*/
        isPalindrome=(newNumber==reverseNumber)?(true):(false);
        return isPalindrome;
    }
}
