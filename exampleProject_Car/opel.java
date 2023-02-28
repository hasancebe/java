package exampleProject_Car;

public class opel {
    public static void main(String[] args) {
        Car astra=new Car("opel","astra",150,450000);
        System.out.println(astra);
        astra.numberOfDoors=4;
        System.out.println(astra.numberOfDoors);

    }
}
