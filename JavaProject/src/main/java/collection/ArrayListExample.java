package collection;

import fileHandling.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String arg[]) {
//        List<Book> list=new ArrayList();  //Generics
//        list.add( new Book(1,"Java Programming", "Preeti", 50));
//        list.add( new Book(1,"Spring Framework", "Haida", 30));
//        list.add( new Book(1,"Python", "Mangal", 80));
//        list.add( new Book(1,"C++", "Nate", 100));

        List<Student> list=new ArrayList();  //Generics
        list.add( new Student(15, "Preeti", 1000.50));
        list.add( new Student(2, "Haida", 2000.30));
        list.add( new Student(4,"Mangal", 3000.30));
        list.add( new Student(6, "Nate",1500.40));
        System.out.println(list);


        System.out.println("After sorting ");
        Collections.sort(list);

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            Student s=(Student)itr.next();
            System.out.println(s);
        }

    }
}

