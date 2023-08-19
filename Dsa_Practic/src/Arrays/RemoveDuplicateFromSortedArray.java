

//Problem Description
// 
// 
//
//Given a sorted array A consisting of duplicate elements.
//
//Your task is to remove all the duplicates and return the length of the sorted array of distinct elements consisting of all distinct elements present in A.
//
//Note: You need to update the elements of array A by removing all the duplicates
//
// 
//
//
//Problem Constraints
//1 <= |A| <= 106
//1 <= Ai <= 2 * 109
//
//
//Input Format
//
//First and only argurment containing the integer array A.
//
//
//
//Output Format
//Return a single integer, as per the problem given.
//
//
//Example Input
//
//Input 1:
//
//A = [1, 1, 2]
//
//Input 2:
//
//A = [1, 2, 2, 3, 3]
//
//
//
//Example Output
//
//Output 1:
//
//2
//
//Output 2:
//
//3
//
//
//
//Example Explanation
//
//Explanation 1:
//
//Updated Array: [1, 2, X] after rearranging. Note that there could be any number in place of x since we dont need it.
//We return 2 here.
//
//Explanation 2:
//
//Updated Array: [1, 2, 3, X, X] after rearranging duplicates of 2 and 3.
//We return 3 from here.
//

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1, 2, 2, 3, 3);
		
		int s=removeDuplicate(arr);
		List<Integer> ans=new ArrayList<>(s);
		for(int i=0;i<arr.size();i++) {
			if(!ans.contains(arr.get(i))){
				ans.add(arr.get(i));
			}
		}
		System.out.println(Arrays.toString(ans.toArray()));
	}
	public static int removeDuplicate(List<Integer> arr) {
		int n=arr.size();
		if(n<=1) {
			return n;
		}
		int index=0;
		for(int i=1;i<n;i++) {
			if(arr.get(i)!=arr.get(index)){
				index++;
				arr.set(index, arr.get(i));
			}
		}
		List<Integer> ans=new ArrayList<>(arr.subList(index, n));
		return ans.size();
	}

}
