
// Java code to illustrate get() method 
import java.io.*; 
import java.util.LinkedList; 

public class LinkedListExample { 
public static void main(String args[]) { 

	// Creating an empty LinkedList 
	LinkedList<String> list = new LinkedList<String>(); 

	// Use add() method to add elements in the list 
	list.add("Geeks"); 
	list.add("for"); 
	list.add("Geeks"); 
	list.add("10"); 
	list.add("20"); 

	// Displaying the list 
	System.out.println("LinkedList:" + list); 
		
	// Fetching the specific element from the list 
	System.out.println("The element is: " + list.get(2)); 


      // Adding new elements to the end 
        // Note: Default addition happens from last 
        list.add("Last"); 
        list.add("Element"); 

     // Adding element at a particular index 
        // by passing as an argument 
        ll.add(2, "Java"); 

        System.out.println("LinkedList:" + list);
    

     // Check if the list contains "Hello"
      System.out.println("\nDoes the List contains 'Hello': "
                                      + list.contains("Hello"));
 
      // Check if the list contains "20"
      System.out.println("Does the List contains '20': "
                                         + list.contains("20"));


        // Using set() method to replace Geeks with GFG
        System.out.println(
            "The Object that is replaced is: "
            + list.set(2, "Spring"));

        // Displaying the modified linkedlist
        System.out.println("The new LinkedList is:" + list);

        
          // Setting the ListIterator at a specified position 
        ListIterator list_Iter = list.listIterator(2); 
  
        // Iterating through the created list from the position 
        System.out.println("The list is as follows:"); 
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next()); 
        
        // Clearing the list 
        list.clear(); 
  
        // Accessing the List after clearing it 
        System.out.println("List after clearing all elements: " + list); 

} 
} 
