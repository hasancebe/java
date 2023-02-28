package odevsorulari2;

//A variable **inhabitants** represents a city and its respective populations.
// City might have a population of 0 due to a pandemic zombie disease that is wiping away
// the human lives. After each day, a city will lose half of its population.
// Write a program to loop the city population and make it lose half of its population
// **until population is zero**. Print the each day like below for each day:
// Example - inhabitants are 6```
//Day 0 [6]
//Day 1 [3]
//Day 2 [1]


import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter inhabitants number");
        int number=scan.nextInt();
        int day=0;
        while(number>0){
            System.out.println("Day. "+ day +" inhabitants number= "+number);
            number=number/2;
            day++;
        }
       // System.out.println("Day. "+ day +" inhabitants number= "+ 0);
    }
}
