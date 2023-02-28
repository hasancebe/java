package Day16_doWhile;

public class C04_doWhileTamKare {
    public static void main(String[] args) {
        int input=12;
        int startPoint=1;
    boolean isSquare= false;


        do{
           if(startPoint*startPoint==input){
               isSquare=true;
               break;
           }else {
               startPoint++;
           }


        }while(startPoint*startPoint<=input);

        System.out.println(isSquare);
    }
}
