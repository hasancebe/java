package Day30_Encapsulation;

public class C01_encappculation {
    private String hospitalName="yildiz hosppital";
    private  int price;

    private String nurseName;

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    private  String nurseAdress;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHospitalName() {
        return hospitalName;
    }
}
