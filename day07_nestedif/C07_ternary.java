package day07_nestedif;
import java.util.Scanner;
public class C07_ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();


        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");

    }
}
