package Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=9;
	int nums[]= {2,7,11,15};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==k) {
					System.out.println(i+" "+j);
					return;
				}
			}
		}

	}

}


/**
 * 
 * Given an array of integer nums and an integer target, return indices of the two numbers such that they add up to the target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9, Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. PRACTICE NOW
 */