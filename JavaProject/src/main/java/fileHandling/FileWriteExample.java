package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String arg[]) {

        try {
            FileWriter writer = new FileWriter("Test.txt");
            writer.write("This is my second update into this file !!");
            writer.close();
            System.out.println("File written successfully");
        }catch(IOException e) {
            System.out.println("An error Occurred ");
            e.printStackTrace();
        }
    }
}
