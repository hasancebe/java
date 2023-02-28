package Day23_Consructions;

public class Car {


        int advertno;
        int price;
        String brand;
        String model;
        String fuelType;
        int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "advertno=" + advertno +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public   int maxSpeed(String fuelType) {
        int maxSpeed = 0;
        if (fuelType.equalsIgnoreCase("diesel")) {
            maxSpeed = 260;
        } else if (fuelType.equalsIgnoreCase("benzine")) {
            maxSpeed = 220;
        }
        return  maxSpeed;
    }
}
