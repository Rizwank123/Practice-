
//Problem Description
// 
// 
//Find the contiguous subarray within an array, A of length N which has the largest sum.
//
//
//Problem Constraints
//1 <= N <= 106
//-1000 <= A[i] <= 1000
//
//
//Input Format
//The first and the only argument contains an integer array, A.
//
//
//Output Format
//Return an integer representing the maximum possible sum of the contiguous subarray.
//
//
//Example Input
//Input 1:
//
//A = [1, 2, 3, 4, -10]
//
//Input 2:
//
//A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
//
//
//Example Output
//Output 1:
//
//10
//
//Output 2:
//
//6
//
//
//
//Example Explanation
//Explanation 1:
//
//The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
//
//Explanation 2:
//
//The subarray [4,-1,2,1] has the maximum possible sum of 6.





package Arrays;

import java.util.Arrays;
import java.util.List;

public class MaximumSumOfContiguousSubArray {

	public static void main(String[] args) {
		List<Integer>a=Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
		System.out.println(contiguous(a));
		
	}
	
	
	public static int contiguous(List<Integer> arr) {
		
		
		int endMax=arr.get(0);
		int soForMax=arr.get(0);
		
		for(int i=1;i<arr.size();i++) {
			endMax=Math.max(arr.get(i), endMax+arr.get(i));
			soForMax=Math.max(soForMax, endMax);
		}
		return soForMax;
	}

}


// Note create two counter  endMax counter which store the max of arr.get(i),maxEnd+arr.get(i);
// we thake another maximum value of maxEnd soFor this is the final answer