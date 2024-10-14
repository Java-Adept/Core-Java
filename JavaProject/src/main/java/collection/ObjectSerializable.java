package collection;
import java.io.*;

public class ObjectSerializable {


       public static void main(String[] args) {
            Book book = new Book(101, "JavaProgramming !","JP", 25.05);

            try (FileOutputStream fileOut = new FileOutputStream("Book.ser");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(book);
                System.out.println("Object has been saved successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }

           try (FileInputStream fileIn = new FileInputStream("Book.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
               book = (Book) in.readObject();
               System.out.println("Object has been Read Successfully");
               System.out.println(book);
           } catch (IOException | ClassNotFoundException e) {
               e.printStackTrace();
           }


        }
}
