package odevSorulari_3;

import java.util.Scanner;

//The method **person** has a string arguement with this format:
//"name,last name,age". Print out the person's informationExample:```
//person("jon,doe,30");output:
//person name: jon
//last name: doe
//age: 30
public class Question_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name, surname and age; please put a comma between every information ");
        String information = scan.nextLine();
        String[] info = information.split(",");
        information(info);
    }
            public static void information(String[]informationArray){

        try {
            System.out.println("person name: "+ informationArray[0]);
            System.out.println("last name: "+ informationArray[1]);
            System.out.println("age: "+ informationArray[2]);
        } catch (Exception e) {
            System.out.println("there is a lack in yor information, please complete ");
        }

    }
}