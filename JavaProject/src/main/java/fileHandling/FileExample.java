package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String arg[]) {

        try {
            File f = new File("Test.txt");
            if(f.createNewFile()) {
                System.out.println("File created :" +f.getName());
            }else  {
                System.out.println("File already exist ");
            }
            }catch(IOException e) {
            System.out.println("An error Occurred ");
            e.printStackTrace();
        }
    }

}
