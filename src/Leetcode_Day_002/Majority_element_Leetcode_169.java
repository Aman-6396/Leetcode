package Leetcode_Day_002;

public class Majority_element_Leetcode_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElementFind(arr));

	}// main function is end

	public static int majorityElementFind(int[] arr) {
		int element = arr[0];
		int vote = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == element) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					element = arr[i];
					vote = 1;
				} // if condition is end

			} // else condition is end
		} // for loop is end

		return element;
	} // majorityElementFind function is end
}
