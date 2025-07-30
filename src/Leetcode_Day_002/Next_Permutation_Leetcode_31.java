package Leetcode_Day_002;

public class Next_Permutation_Leetcode_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 1, 3, 3 };

		int[] brr = nextPermu(arr);

		for (int v : brr) {
			System.out.print(v + " ");
		} // for each loop is end

	} // main function is end

	public static int[] nextPermu(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {

			
			if (arr[i] > arr[i - 1]) {

				int minpos = findSmallestElment(arr, i);
				
				// Swap arr[minpos] with arr[i -1]
				int temp = arr[i - 1];
				arr[i - 1] = arr[minpos];
				arr[minpos] = temp;
				
				// Reverse the array from arr[i] to the end
				reverseArray(arr, i, arr.length - 1);
				return arr;

			} // if condition is end

			
		} // for loop of 'i' is end

		reverseArray(arr, 0, arr.length - 1);// when we at the largest lexicographical order then we have to rotate the
												// whole array

		return arr;

	} // nextPermu function is end

	public static int findSmallestElment(int[] arr, int i) {

		int minpos = i;
		for (int j = i + 1; j < arr.length; j++) {

			if (arr[j] > arr[i - 1] && arr[minpos] >= arr[j]) { // arr[j] > arr[i - 1] && arr[minpos] > arr[j] find
																// smaller element greater than arr[i - 1]

				minpos = j;

			} // if condition is end

		} // for loop of 'j' is end

		return minpos;

	} // findSmallestElment function is end

	public static void reverseArray(int[] arr, int left, int right) {

		while (left <= right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		} // while loop is end

	} // reverseArray function is end

}
