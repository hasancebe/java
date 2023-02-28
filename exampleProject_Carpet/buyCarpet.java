package exampleProject_Carpet;

public class buyCarpet {
    public static void main(String[] args) {
        Carpet hali=new Carpet();
        Carpet hali2=new Carpet(300,200,2.5,true);
        Carpet hali3=new Carpet(300,200,2.5,false);
        System.out.println(hali);
        System.out.println(hali.totalPrice);
        System.out.println(hali2);
        System.out.println(hali2.totalPrice);
        System.out.println(hali3);
        System.out.println(hali3.totalPrice);
    }
}
