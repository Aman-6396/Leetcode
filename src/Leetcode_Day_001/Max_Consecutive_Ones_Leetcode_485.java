package Leetcode_Day_001;

public class Max_Consecutive_Ones_Leetcode_485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,1,1,1,0,1,1,1};
		
		System.out.println(maxConsecutiveOnes(arr));

	}// main function is end 
	
	public static int maxConsecutiveOnes(int[] arr) {
		
		// similiar to moore's voting 
		int vote = 0;
		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] == 1) {
				vote++;
				
			} else { // arr[i] != 1;
				vote = 0;
			}
			
			ans = Math.max(ans, vote);
			
		} // for loop of 'i' is end 
		
		return ans;
		
	} // maxConsecutiveOnes function is end

}
