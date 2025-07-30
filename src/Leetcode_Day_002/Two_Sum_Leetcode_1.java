package Leetcode_Day_002;

import java.util.Arrays;

public class Two_Sum_Leetcode_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,7,11,15};
		int target = 9;
		
		int[] brr = isTwoSum(arr, target);
		
		for(int i = 0; i < brr.length; i++) {
			
			System.out.println(brr[i] + " ");
			
		}// for loop of isTwoSum is end
		
	} // main function is end 
	
	public static int[] isTwoSum(int[] arr, int target) {
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 1;i++) {
			
			int newtarget = target - arr[i];
			
		} // for loop of 'i' is end
		
		return arr;
		
	} //isTwoSum function is end 

}
