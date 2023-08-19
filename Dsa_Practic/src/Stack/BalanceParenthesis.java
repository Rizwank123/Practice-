
//Problem Description
//
//Given a string A consisting only of '(' and ')'.
//
//You need to find whether parantheses in A is balanced or not ,if it is balanced then return 1 else return 0.
//
//
//
//Problem Constraints
//
//1 <= |A| <= 105
//
//
//Input Format
//
//First argument is an string A.
//
//
//Output Format
//
//Return 1 if parantheses in string are balanced else return 0.
//
//
//Example Input
//
//Input 1:
//
// A = "(()())"
//
//Input 2:
//
// A = "(()"
//
//
//
//Example Output
//
//Output 1:
//
// 1
//
//Output 2:
//
// 0
//
//
//
//Example Explanation
//
//Explanation 1:
//
// Given string is balanced so we return 1
//
//Explanation 2:
//
// Given string is not balanced so we return 0



package Stack;

import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="(()";
		System.out.println(isBalance(s));

	}
	
	public static int isBalance(String s) {
		if(s.charAt(0)==')') return 0;
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stk.push(s.charAt(i));
				
			}
			else if(s.charAt(i)==')' && !stk.isEmpty() && stk.peek()=='(') {
				stk.pop();
			}
			else return 0;
		}
		return stk.isEmpty()?1:0;
	}

}
