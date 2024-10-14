package Test;

import java.util.HashMap;
import java.util.Map;


public class LargestNonRepeatingCharactersString {
	
	    public static void main(String[] args) {
	        String input = "abcdefabcbbcvfgdhry";
	        int length = findLongestSubstringLength(input);
	        System.out.println("The length of the longest substring without repeating characters is: " + length);
	    }

	    public static int findLongestSubstringLength(String s) {
	        // Map to store the last index of every character seen
	        Map<Character, Integer> map = new HashMap<>();
	        int maxLength = 0;
	        int start = 0;

	        for (int end = 0; end < s.length(); end++) {
	            char currentChar = s.charAt(end);
	            
	            // If character has been seen, move the start to the right of the last index of this character
	            if (map.containsKey(currentChar)) {
	                start = Math.max(start, map.get(currentChar) + 1);
	            }

	            // Update the last index of the character
	            map.put(currentChar, end);
	            System.out.println("Map "+ map);
	            // Calculate the length of the current substring
	            maxLength = Math.max(maxLength, end - start + 1);
	            System.out.println("MAxLength :"+maxLength);
	        }

	        return maxLength;
	    }
	
}
