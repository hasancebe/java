package exampleProject_Car;

public class Car {
    String marka="unknown";
    String model="unknown";
    int numberOfDoors;
    int topSpeed=90;
    double price=0;

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                '}';
    }

    public Car(){}

    public Car(String marka, String model, int topSpeed, double price) {
        this.marka = marka;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(int numberOfDoors, int topSpeed, double price) {
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String marka, String model, int numberOfDoors) {
        this.marka = marka;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }
}
