package Day35_exepcition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_FileInputStreams {


    public static void main(String[] args) throws FileNotFoundException, IOException {
                int k;

        try {
            FileInputStream fis;
            fis = new FileInputStream("Day35_exepcition/test");
            //FileInputStream fis2=new FileInputStream(filePath);

            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("java did not find file");
        }catch (IOException e) {
            System.out.println("java did not read or write");
        }

    }
}
