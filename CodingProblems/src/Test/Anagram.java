package Test;

import java.util.stream.Collectors;

public class Anagram {
	 public static boolean areAnagrams(String str1, String str2) { 
		
		        // If lengths are not equal, they cannot be anagrams
		        if (str1.length() != str2.length()) {
		            return false;
		        }

		        // Use streams to sort and compare the strings
		        String sortedStr1 = str1.chars()
		                                .sorted()
		                                .mapToObj(c -> String.valueOf((char) c))
		                                .collect(Collectors.joining());
		        
		        String sortedStr2 = str2.chars()
		                                .sorted()
		                                .mapToObj(c -> String.valueOf((char) c))
		                                .collect(Collectors.joining());

		        return sortedStr1.equals(sortedStr2);
		    }
		
	 
	    public static void main(String[] args) { 
	        String str1 = "listen"; 
	        String str2 = "silent"; 
	        System.out.println(areAnagrams(str1, str2)); // Output: true 
	    }

}
