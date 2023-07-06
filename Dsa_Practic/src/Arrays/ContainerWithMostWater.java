package Arrays;



//10. Container With Most Water
//You are given an integer array height of length n.
//There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[I]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by an array [1,8,6,2,5,4,8,3,7].
//In this case, the max area of water (blue section) the container can contain is 49.

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int height[]= {1,8,6,2,5,4,8,3,7};
		int area;
		int max=0;
		int s=0,e=height.length-1;
		while(s<e) {
			area=Math.min(height[s], height[e])*(e-s);
			if(max<area) max=area;
			if((Math.min(height[s], height[e])==height[s])){
				s++;
			}
			else e--;
		}
		System.out.println(max);
	}

}
