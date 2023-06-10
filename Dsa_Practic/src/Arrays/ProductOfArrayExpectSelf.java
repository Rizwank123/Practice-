package Arrays;
import java.util.*;

public class ProductOfArrayExpectSelf {
	
	
//	Product of Array Except Self
//	Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[I].
//	The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//	You must write an algorithm that runs in O(n) time and without using the division operation.
//	Input: nums = [1,2,3,4] Output: [24,12,8,6]
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-1,1,0,-3,3};
		
		int prefix[]=new int[nums.length];
		
		prefix[0]=1;
		for(int i=1;i<nums.length;i++) {
			prefix[i]=prefix[i-1]*nums[i-1];
		}
		int r=1;
		for(int i=nums.length-1;i>=0;i--) {
			
			prefix[i]*=r;
			r*=nums[i];
		}
		
		System.out.println(Arrays.toString(prefix));
		//System.out.println(Arrays.toString(postfix));

	}

}
