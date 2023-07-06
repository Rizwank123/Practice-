package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int nums[]= {-2,0,0,2,2};
		
		Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
             int j=i+1,k=nums.length-1;
             while(j<k){
                 int sum=nums[i]+nums[j]+nums[k];
                 if(sum<0){
                     j++;
                 }
                 else if(sum>0){
                     k--;
                 }
                 else{
                     List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                 ans.add(temp);
                 j++;
                 k--;
                 while(j<k && nums[j]==nums[j-1]) j++;
                 while(j<k && nums[k]==nums[k+1]) k--;
                 }
             }
        }
        System.out.println(ans.toString());
	}

}
