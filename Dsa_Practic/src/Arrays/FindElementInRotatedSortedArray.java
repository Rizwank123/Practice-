package Arrays;



//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,
// nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.


public class FindElementInRotatedSortedArray {

	public static void main(String[] args) {
		
		int nums[]= {0,1,2,4,5,6,7};
		int k=0;
		int s=0,e=nums.length-1;
		int ans=-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if (nums[mid] == k) {
                ans = mid;
                break;
            }
            
            if (nums[s] <= nums[mid]) {
                // Left half is sorted
                if (nums[s] <= k && k < nums[mid]) {
                    e = mid - 1; // Update end index
                } else {
                    s = mid + 1; // Update start index
                }
            } else {
                // Right half is sorted
                if (nums[mid] < k && k <= nums[e]) {
                    s = mid + 1; // Update start index
                } else {
                    e = mid - 1; // Update end index
                }
            }
        }
        
        System.out.println(ans);
	}
}
