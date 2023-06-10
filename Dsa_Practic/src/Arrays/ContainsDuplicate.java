package Arrays;

import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Input: nums = [1,2,3,1] Output: true



public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[]= {1,2,3,1};
		Set<Integer>hs=new HashSet<>();
		 for(int i=0;i<nums.length;i++) {
			if(hs.contains(nums[i])) {
				System.out.println(true);
				return;
			}
			else {
				hs.add(nums[i]);
			}
		 }

	}

}
