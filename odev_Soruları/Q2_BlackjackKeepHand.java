package odev_Soruları;

import java.util.Scanner;

public class Q2_BlackjackKeepHand {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter house score");
        int house_Score=scan.nextInt();

        System.out.println("please enter player score");
        int player_Score=scan.nextInt();

        if(player_Score>21){
            System.out.println("you lost");
        } else if (player_Score>house_Score) {
            System.out.println("player win");
        } else if (house_Score>player_Score) {
            System.out.println("house win");
        } else if (player_Score==house_Score) {
            System.out.println("you are draw with house");

        }
    }
}
