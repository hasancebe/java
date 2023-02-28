package exampleProject_Phone;

public class cameraPhone {
    public static void main(String[] args) {
        Phone samsung=new Phone();
        Phone lg=new Phone(8,9);
        Phone nokia=new Phone();
        samsung.memorySize=10;
        samsung.imageSize=10;
        System.out.println(samsung.imageSize);
        samsung.numPictures();
        lg.numPictures();
        System.out.println(nokia.imageSize+" "+ nokia.memorySize);
        nokia.numPictures();
    }



}
