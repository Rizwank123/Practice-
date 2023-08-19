package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueElement {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,8,7,6,6,7};
		//Map<Integer, Long> hs=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//int[] unique=Arrays.stream(arr).distinct().toArray();
		//.out.println(unique.toString());
		
		Map<Integer,Integer>hs=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int c=hs.getOrDefault(arr[i], 0);
			hs.put(arr[i], c+1);
		}
		
		//System.out.println(hs);
		Arrays.stream(arr).filter(num->hs.get(num)==1).forEach(System.out:: println);
		
	}

}
