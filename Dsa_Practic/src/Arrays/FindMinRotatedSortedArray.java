package Arrays;




//7. Find the Minimum in Rotated
//Sorted Array
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//You must write an algorithm that runs in O(log n) time.
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.




public class FindMinRotatedSortedArray {

	public static void main(String[] args) {
		 int nums[]= {2,1};
		int s=0,e=nums.length-1;
		int min=nums[0];
		while(s<=e) {
			if(nums[s]<=nums[e]) {
				min=Math.min(min, nums[s]);
				break;
				
			}
			int mid =(s+e)/2;
			min=Math.min(min, nums[mid]);
			if(nums[mid]>=nums[s]) {
				s=mid+1;
			
		
			}
			else {
				e=mid-1;
			}
	
		}
		System.out.println(min);

		
	}

}
