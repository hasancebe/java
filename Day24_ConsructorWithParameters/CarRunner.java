package Day24_ConsructorWithParameters;

public class CarRunner {
    public static void main(String[] args) {


        Car firstcar = new Car();
        firstcar.advertno=1234;
        firstcar.brand="opel";
        firstcar.model="corsa";
        firstcar.fuel="benzine";
        firstcar.year=1999;
        Car secondCar= new Car(4569,"honda","civic","diesel",2005);
        System.out.println(secondCar);
        Car thirdCar=new Car(12345,"mercedes","c100");
        System.out.println(thirdCar);
    }
}