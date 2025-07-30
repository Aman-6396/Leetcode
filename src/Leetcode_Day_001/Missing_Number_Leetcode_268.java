package Leetcode_Day_001;

//import java.util.Arrays;

public class Missing_Number_Leetcode_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		System.out.println(missingElement(arr));

	} // main funciton is end

	public static int missingElement(int[] arr) {

		// By sortin array ==> Time complexity is O(nlog(n))
//		Arrays.sort(arr); // sort the array 
//		
//		int count = 0;
//	    for(int i = 0; i < arr.length; i++) {
//	    	
//	    	if(arr[i] == count) {
//	    		count++;
//	    	} else {
//	    		return count;
//	    	}
//	    } // for loop 
//	
//	    return count;

		// By sum of n natural numbers ==> Time complexity is O(n)
		int n = arr.length;
		int experimentalSum = n * (n + 1) / 2;

		int sum = 0; // theoretical sum

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		} // for loop is end

		return experimentalSum - sum;

	} // missingElement function is end

}
