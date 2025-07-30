package Leetcode_Day_002;

public class Sort_Colors_Leetcode_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 0, 2, 1, 1, 0, 1 };

		sortElements(arr);

		// Print the sorted elements
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // for loop of 'i' is end

	} // main function is end

	public static void sortElements(int[] arr) {

		// Sort 0 and 2, 1 toh already sort ho jayega
//		int red = 0; // first index of an array
//		int blue = arr.length - 1; // last index of an array
//		int[] brr = new int[arr.length]; 
//		
//		for(int i =0; i < brr.length; i++) {
//			brr[i] = arr[i];
//		}
//
//		for (int i = 0; i < brr.length; i++) {
//			if (brr[i] == 0) {
//				
//				arr[red] = brr[i];
//				red++; // update
//				
//			} else if(brr[i] == 2){  // arr[i] == 2
//				
//				arr[blue] = brr[i];
//				blue--;
//				
//			} // if-else condition is end
//
//		} // for loop of 'i' is end
//		
//		while(red <= blue) { // for red < blue ek index me value nhi ayegi uski default value 0 show karega
//			arr[red] = 1;
//			red++;
//		} // is method se space complexity jada ayegi

		// Dutch National Flag Algorithm

		int left = 0;
		int right = arr.length - 1;
		int i = 0; // i is a counter 

		while (i <= right) {

			if (arr[i] == 0) {
				// Swap arr[i] with arr[left]
				int temp = arr[i];
				arr[i] = arr[left];
				arr[left] = temp;
				left++; // update the left for next 0
				i++;

			} // if condition is end

			else if (arr[i] == 2) {
				// Swap arr[i] with arr[right]
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				right--; // update the left for next 0

			} // else if condition is end

			else {// arr[i] == 1
				i++; // if arr[i] == 1 then move to next element

			} // else condition is end

		} // while loop is end

	} // sortElements function is end

}
