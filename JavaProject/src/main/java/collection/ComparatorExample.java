package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String arg[]) {


        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(4,"Nate", 2340.50));
        list.add(new Employee(2,"Mangal", 1340.50));
        list.add(new Employee(3,"Haida", 3340.50));
        list.add(new Employee(5,"Ruth", 2640.50));

//
//        ArrayList<Book> list2=new ArrayList<>();
//        list2.add(new Book(4,"Nate","", 26));
//        list2.add(new Book(2,"Nate","", 26));
//
//        Collections.sort(list2);


        System.out.println("Before Sorting");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list, new CompareByID());



        System.out.println("After Sorting");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list, new CompareByName());

        System.out.println("After Sorting by name");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

;    }






}

class CompareByID implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return  e1.getId() - e2.getId();
    }
}

class CompareByName implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());

    }
}

