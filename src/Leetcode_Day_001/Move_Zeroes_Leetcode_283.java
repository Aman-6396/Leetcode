package Leetcode_Day_001;

public class Move_Zeroes_Leetcode_283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 0, 1, 3, 12 };

		moveZeroesofArr(nums);

		for (int v : nums) { // for each loop
			System.out.print(v + " ");
		}

	} // moveZeroesofArr function is end

	public static void moveZeroesofArr(int[] arr) {

		// This method is not applicable for this input 0, 0, 1, 3, 12 plus me time complexity is O(n^2) 
//		for(int i = 0; i < arr.length; i++) {
//			
//			if(arr[i] == 0) {
//				
//				for(int j = i; j < arr.length - 1; j++) {
//					
//					arr[j] = arr[j+1];
//					
//				} // for loop of 'j' is end 
//				
//				arr[arr.length - 1] = 0; // put zero at the last index
//				
//			} // if condition is end 
//			
//		} // for loop of 'i' is end
//		

		// Method second
		// This method is good with time complexity is O(n)
//		int pos = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] != 0) {
//				int temp = arr[pos];
//				arr[pos] = arr[i];
//				arr[i] = temp;
//				pos++;
//			} // if condition is end
//
//		} // for loop is end
		
		
		// Method third simple and easy with Time complexity O(N)
		int pos = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
				
			} // if condition is end
			
		} // for loop is end 
		
		while(pos < arr.length) {
			arr[pos] = 0;
			pos++;
		}

	} // moveZeroesofArr function is end
}
