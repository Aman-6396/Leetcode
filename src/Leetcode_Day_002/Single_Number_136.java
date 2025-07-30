package Leetcode_Day_002;

import java.util.Arrays;

public class Single_Number_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,1,2,1,2};
		
		
		
		System.out.println(findSingleNum(arr));
		
	} // main function is end
	
	public static int findSingleNum(int[] arr) {
		
		Arrays.sort(arr);
		int ans = Integer.MIN_VALUE;
		
		if(arr.length == 1){
            return arr[0];
        }
		
		for(int i = 0; i < arr.length; i++) {
			
		if(arr[i] == arr[i + 1]) {
			i = i + 2;
		} else {
			ans = arr[i];
		}
			
		} // for loop 'i' is end
		
		return ans;
		
	} // findSingleNum function is end 

}
