package Arrays;

import java.util.Arrays;

public class MissingAndRepeatingElementInArray {

	public static void main(String[] args) {
		
		
		int arr[]= {4,3,6,2,1,1};
		int ans[]=missingNumber(arr);
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static int[] missingNumber(int arr[]) {
		int[] ans=new int[2];
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(i>0 && arr[i]==arr[i-1]) ans[0]=arr[i];
			if(arr[i]!=i+1) {
				ans[1]=i+1;
				
			}
		}
		return ans;
	}

}
