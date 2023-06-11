package Arrays;


//Maximum Product Subarray
//Given an integer array nums, find a subarray that has the largest product, and return the product.
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

public class MaximumProductOfSubArray {

	public static void main(String[] args) {
		int nums[]= {3,-1,4};
		int currPoduct=1;
		int start=0;
		int max_pro=Integer.MIN_VALUE;
		
		while(start<nums.length) {
			currPoduct*=nums[start];
			if(currPoduct>max_pro) {
				max_pro=currPoduct;
			}
			start++;
			if(currPoduct<=0) {
				currPoduct=1;
			}
		}
		System.out.println(max_pro);

	}

}
