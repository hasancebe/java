package odevSorulari_3;

import java.util.Scanner;

//Methods with returnThe **waterTax** method calculates a water bill. The method takes a
// double and returns a double.The more water you use the more it will cost you>Cost `under 50`:```
//bill = units * 0.60;
//```>Cost `above 50`:```
//bill = units * 0.90;
//```> Cost above 100 the calculation
// is same as `above 50` but an additional 50 fine>
// Cost above 150 its the same as `above 50` but an additional 100 fineExamples:```
//waterTax(50)returns 30
//waterTax(55)returns 49.5
//waterTax(101)returns 140.9
//waterTax(151)returns 235.9
public class Question_6 {
    public static void main(String[] args) {
        System.out.println(waterTax());

    }

    public static double waterTax() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter of used water ");
        double usedWater = scan.nextDouble();
        double bill = 0;
      if(usedWater>0){
            if (usedWater <= 50.0) {
                bill = usedWater * 0.6;
            } else if ( usedWater <= 100.0) {
                bill = usedWater * 0.9;
            } else if (usedWater <= 150.0) {
                bill = usedWater * 0.9 + 50;
            } else  {
                bill = usedWater * 0.9 + 100;
            }}

            return bill;
        }
    }
