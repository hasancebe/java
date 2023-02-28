package exampleProject_Carpet;

public class Carpet {

    public double width=300;
    public double length=300;
    public double unitPrice=0;
    public double totalPrice=200;
    public boolean isPersian=true;

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        if (isPersian) {
            totalPrice = ((width + length) * unitPrice) + 200;
        } else {
            totalPrice = (width + length) * unitPrice;
        }
    }

    public Carpet(){}



}
