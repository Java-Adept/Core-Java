package fileHandling;


import java.io.*;
import java.util.ArrayList;

public class FileOutputStreamExample {

public static void main(String args[]) {

//    ArrayList<String> list = new ArrayList<>();
//    list.add("Preeti");
//    list.add("Mangal");
//    list.add("Haida");
//    list.add("Kenneth");
//    list.add("Nate");

    Student s =new Student(1, "Preeti", 3000.56);

  try{
      //Serialization
      FileOutputStream fs = new FileOutputStream("Test2.txt");
      ObjectOutputStream objStream= new ObjectOutputStream(fs);
      objStream.writeObject(s);
      objStream.close();
      fs.close();
    System.out.println("File written successfully");

      //De-serialization
      FileInputStream fi= new FileInputStream("Test2.txt");
      ObjectInputStream objInputStream= new ObjectInputStream(fi);


      Student obj=(Student)objInputStream.readObject();
      System.out.println(obj.getStudentId());
      System.out.println(obj.getName());


  }catch(IOException e) {
      System.out.println(e.getMessage());
  } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
  }

}

}
