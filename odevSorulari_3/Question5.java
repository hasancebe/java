package odevSorulari_3;

import java.util.Scanner;

//Complete the method **isPalindrome()** that will check if number is a palindrome.
// Print your result as a boolean (true or false).
//> Challenge: Do not convert int into a string!Examples:```
//input: 1001output: true
//``````
//input: 1234output: false
public class Question5 {
    public static void main(String[] args) {
        System.out.println(isPalidrome());

    }
    public static boolean isPalidrome(){
        boolean isPalindrome;
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=scan.nextInt();
        int newNumber=0;
        int modules=0;
        int reverseNumber=0;
        newNumber=number;
        while(number>0){
            modules=number%10;//112----2-----1------1
            reverseNumber=(reverseNumber*10)+modules;//20+1------210+1------211-----false
            number=number/10;//11-----1-----0

        }
        System.out.println(number);
        System.out.println(newNumber);
        System.out.println(reverseNumber);
        isPalindrome = newNumber == reverseNumber;
        return isPalindrome;

}}
