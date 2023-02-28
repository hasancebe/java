package exampleProject_Calculation;

public class Calculation {
   private String names;
   private int x,y,result;

   public int getResult() {
      return result;
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }
   void plus(){
      int plus=x+y;
      result=plus;
      //System.out.println(result);
   }
   void minus(){
      int minus=x-y;
      result=minus;
     // System.out.println(result);
   }
}
