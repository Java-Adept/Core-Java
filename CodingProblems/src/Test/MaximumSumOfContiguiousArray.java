package Test;


public class MaximumSumOfContiguiousArray {
	    public static void main(String[] args) {
	        int[] array = {1, 4, 5, 9, 2, 10};

	        int maxSum = findMaxSumOfContinuousPairs(array);
	        System.out.println("The maximum sum of continuous pairs is: " + maxSum);
	    }

	    public static int findMaxSumOfContinuousPairs(int[] array) {
	        if (array == null || array.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least two elements.");
	        }

	        int maxSum = Integer.MIN_VALUE;
	        System.out.println("Integer Minimum value : "+maxSum);

	        for (int i = 0; i < array.length - 1; i++) {
	            int sum = array[i] + array[i + 1];
	            if (sum > maxSum) {
	                maxSum = sum;
	            }
	        }

	        return maxSum;
	    }
	}


