package Leetcode_Day_001;

public class Remove_Duplicates_from_Sorted_Array_Leetcode_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		System.out.println(removeSameElement(arr));

		for (int v : arr) {
			System.out.println(v + " ");
		}

	} // main function is end

	public static int removeSameElement(int[] arr) {

//		int start = arr[0];
//		int j = 0;
//		int count = 1;
//		arr[j] = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//
//			if (arr[i] != start) {
//				start = arr[i];
//				arr[j] = start;
//				j++;
//				count++;
//			}
//		}
//
//		return count;

		int element = arr[0];
		int count = 1;
		int j = 0;
		arr[j] = element;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != element) {

				element = arr[i];
				j++;
				count++;
				arr[j] = element;

			}

		} // for loop is end

		return count;

	} // removeSameElement function is end

}
