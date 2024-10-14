// Method 1 - containsAll() 
// Java Program to illustrate
// containsAll() method

// Importing all classes frm
// java.util package
import java.util.*;

// Class
class ArrayListExample {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an empty list
        // Declaring an Integer type object
        List list1 = new ArrayList();

        // Adding custom elements to the List
        // using add() method
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        // Creating another empty list of Integer type
        List list2 = new ArrayList();

        // Again, adding custom elements to the List
        // using add() method
        list2.add(10);
        list2.add(30);

        // Returns true if all the elements of list2
        // is present in list1
        // If not, return false
        System.out.println(list1.containsAll(list2));
    }
}
