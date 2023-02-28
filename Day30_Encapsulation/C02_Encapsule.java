package Day30_Encapsulation;

public class C02_Encapsule {
    public static void main(String[] args) {
        C01_encappculation pers1=new C01_encappculation();
       // pers1.nurseName="hatice";
        // pers1.nurseAdress="yeni mahalle";
        System.out.println(pers1.getHospitalName());
        pers1.setPrice(1000);
        pers1.setNurseName("hatice");
        System.out.println(pers1.getNurseName());
        pers1.setNurseName("zühal");
        System.out.println(pers1.getNurseName());



    }
}
