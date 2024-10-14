// Java program to Remove Elements from ArrayList 
// Using remove() method by indices 

// Importing required classes 
import java.util.ArrayList; 
import java.util.List; 

// Main class 
public class ArrayListExampleSet { 
	// Main driver method 
	public static void main(String[] args) 
	{ 
		// Creating an object of List interface with 
		// reference to ArrayList class 
		List<Integer> al = new ArrayList<>(); 

		// Adding elements to our ArrayList 
		// using add() method 
		al.add(10); 
		al.add(20); 
		al.add(30); 
		al.add(1); 
		al.add(2); 

		// Printing the current ArrayList 
		System.out.println(al); 

		// This makes a call to remove(int) and 
		// removes element 20 
		al.remove(1); 

		// Now element 30 is moved one position back 
		// So element 30 is removed this time 
		al.remove(1); 

		// Printing the updated ArrayList 
		System.out.println(al); 
         // Replacing element at the index 7 with 30 
            // using method set() 
            System.out.println("\nTrying to Replace"
                               + " the element at"
                               + " (index > Capacity) "); 
            int i = al.set(7, 30); 
  
            // Print the modified arrlist 
            System.out.println("After operation: "
                               + al); 
  
            // Print the Replaced element 
            System.out.println("Replaced element: "
                               + i); 
        } 
  
        catch (IndexOutOfBoundsException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    
	} 
}
