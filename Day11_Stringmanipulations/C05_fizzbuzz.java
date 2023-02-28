package Day11_Stringmanipulations;

public class C05_fizzbuzz {
    public static void main(String[] args) {
        int sayi=145;
        for (int i = 1; i <sayi ; i++) {

            if(i%3==0&&i%5==0){
                System.out.print("fizzBuzz \n");
            } else if (i%3==0) {
                System.out.print("fizz ");

            } else if (i%5==0) {
                System.out.print("buzz ");
            }
            else {
                System.out.print(i + " ");
            }

        }
    }
}
