package Leetcode_Day_002;

public class Buy_and_Sell_Stock_Leetcode_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 1, 5, 3, 6, 4}; // 2, 4, 1 

		System.out.println(maximumProfit(arr));

	} // main function is end

	public static int maximumProfit(int[] arr) {

		// Mera method but isse test cases fas rhe hai ex arr = { 2, 4, 1} actual answer
		// = 2 but my answer is 0
		// For minimum value
//		int min = Integer.MAX_VALUE;
//		int minindex = -1;
//		for (int i = 0; i < arr.length; i++) {
//			min = Math.min(arr[i], min);
//			if (min == arr[i]) {
//				minindex = i; // update the value of minindex
//			} // if condition is end
//		} // for loop of 'i' is end
//
//		// For maximum value
//		int max = Integer.MIN_VALUE;
//		int maxindex = -1;
//		for (int j = minindex + 1; j < arr.length; j++) {
//			if (arr[j] > min) {
//				max = Math.max(max, arr[j]);
//			}
//			if (max == arr[j]) {
//				maxindex = j;
//			}
//		} // for loop of 'j' is end
//
//		if (maxindex > minindex) {
//			return arr[maxindex] - arr[minindex];
//		}
//
//		return 0;
		
		
		// Shouryaa's answer 
		  int minPrice = arr[0];
	        int maxProfit = 0;

	        for (int i = 1; i < arr.length; i++) {
	            int currentProfit = arr[i] - minPrice;

	            // Max profit update
	            if (currentProfit > maxProfit) {
	                maxProfit = currentProfit;
	            }

	            // Minimum price update, agar nayi sasti price mile
	            if (arr[i] < minPrice) {
	                minPrice = arr[i];
	            }
	        }
	        return maxProfit;

	}// maximumProfit function is end

}
