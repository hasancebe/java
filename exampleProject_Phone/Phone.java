package exampleProject_Phone;

public class Phone {
    int imageSize=8;
    int memorySize=8;

    public Phone() {

    }

    public  Phone(int imageSize,int memorySize){
        this.imageSize=imageSize;
        this.memorySize=memorySize;
    }

    public  void numPictures() {

        int numPics =(memorySize*1000)/imageSize;
        System.out.println("memeory area= "+ memorySize+" GB image size= "+ imageSize+" MB"+'\n'+" you can take "
                +numPics+" pictures");

    }
}
