
package Arrays;

//42. Trapping Rain Water

//Given n non-negative integers representing an elevation map where the width of each bar is 1,
//compute how much water it can trap after raining.
//
//
//
//Example 1:
//
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
//In this case, 6 units of rain water (blue section) are being trapped.


public class TrappingRainWater {

	public static void main(String[] args) {
		int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int n=height.length;
		int left=0,right=n-1;
		int res=0;
		 int max_left=0,max_right=0;
		while(left<=right) {
			if(height[left]<=height[right]) {
				if(height[left]>=max_left) max_left=height[left];
				else res+=max_left-height[left];
				left++;
			}
			else {
				if(height[right]>=max_right) max_right=height[right];
				else res+=max_right-height[right];
				right --;
			}
		}
		System.out.println(res);
	}

}
