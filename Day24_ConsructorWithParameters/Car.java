package Day24_ConsructorWithParameters;

public class Car {
    int advertno;
    String brand="not assigned";
    String model="not assigned";
    String fuel;
    int year;

    public  Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "advertno=" + advertno +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(int advertno, String brand, String model, String fuel, int year){
        this.advertno=advertno;
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
        this.year=year;
    }

    public Car(int advertno, String brand, String model) {
        this.advertno = advertno;
        this.brand = brand;
        this.model = model;
    }


}
