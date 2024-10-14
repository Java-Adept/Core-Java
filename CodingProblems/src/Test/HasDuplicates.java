package Test;


	
	import java.util.Arrays;
	import java.util.Set;
	import java.util.stream.Collectors;

	public class HasDuplicates {
	    public static void main(String[] args) {
	        Integer[] array = {1, 2, 3, 4, 5, 1}; // Example array

	        boolean hasDuplicates = hasDuplicates(array);

	        System.out.println("Array has duplicates: " + hasDuplicates);
	    }

	    public static <T> boolean hasDuplicates(T[] array) {
	        Set<T> set = Arrays.stream(array)
	                           .collect(Collectors.toSet());

	        return set.size() < array.length;
	    }
	}


