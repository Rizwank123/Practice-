//Problem Description
// 
// 
//
//Given an 2D integer array A of size N x 2 denoting time intervals of different meetings.
//
// 
//
//Where:
//
// 
//
//    A[i][0] = start time of the ith meeting.
//    A[i][1] = end time of the ith meeting.
//
// 
//
//Find the minimum number of conference rooms required so that all meetings can be done.
//
//Note :- If a meeting ends at time t, another meeting starting at time t can use the same conference room
//
// 
//
//
//Problem Constraints
//
//1 <= N <= 105
//
// 
//
//0 <= A[i][0] < A[i][1] <= 2 * 109
//
// 
//
//
//Input Format
//
//The only argument given is the matrix A.
//
//
//Output Format
//
//Return the minimum number of conference rooms required so that all meetings can be done.
//
//
//Example Input
//
//Input 1:
//
// A = [      [0, 30]
//            [5, 10]
//            [15, 20]
//     ]
//
//Input 2:
//
// A =  [     [1, 18]
//            [18, 23]
//            [15, 29]
//            [4, 15]
//            [2, 11]
//            [5, 13]
//      ]
//
//
//
//Example Output
//
//Output 1:
//
// 2
//
//Output 2:
//
// 4
//
//
//
//Example Explanation
//
//Explanation 1:
//
// Meeting one can be done in conference room 1 form 0 - 30.
// Meeting two can be done in conference room 2 form 5 - 10.
// Meeting three can be done in conference room 2 form 15 - 20 as it is free in this interval.
//
//Explanation 2:
//
// Meeting one can be done in conference room 1 from 1 - 18.
// Meeting five can be done in conference room 2 from 2 - 11.
// Meeting four can be done in conference room 3 from 4 - 15.
// Meeting six can be done in conference room 4 from 5 - 13.
// Meeting three can be done in conference room 2 from 15 - 29 as it is free in this interval.
// Meeting two can be done in conference room 4 from 18 - 23 as it is free in this interval.


package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRoom {

	public static void main(String[] args) {
		List<List<Integer>>m=Arrays.asList( Arrays.asList(0,30),Arrays.asList(18,23),Arrays.asList(15,29),Arrays.asList(4,15),Arrays.asList(2,11),Arrays.asList(5,13));
            
		int ans=countRoom(m);
		System.out.println(ans);
		
	}
	public static int countRoom(List<List<Integer>> m) {
		Collections.sort(m,Comparator.comparingInt(a->a.get(0)));
		
		PriorityQueue<Integer> endTime=new PriorityQueue<>();
		//endTime.add(m.get(0).get(1));
		for(List<Integer> a:m) {
			if(!endTime.isEmpty() && endTime.peek()<=a.get(0)) {
				endTime.poll();
			}
			else endTime.offer(a.get(1));
			
		}
		return endTime.size();
	}

}

//Note:
//sort with starting time 
//create a priority queue to store end time
//
//check if the time is not empty and the top of the end is <= the next starting time 
//then remove the end time from the queue 
//else add current interval end time that is a.get(1)
//
