package Arrays;



//Maximum Subarray
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum of 1.

public class MaxixmumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max_sum=Integer.MIN_VALUE;
		
		int arr[]= {5,4,-1,7,8};
		int currSum=0;
		int end=0;
		while(end<arr.length) {
			currSum+=arr[end];
			if(currSum>max_sum) {
				max_sum=currSum;
				
			}
			if(currSum<0) {
				currSum=0;
				//start=end+1;
			}
			end++;
		}
		System.out.println(max_sum);

	}

}
