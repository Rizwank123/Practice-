//Problem Description
// 
// 
//
//You are given a string A of size N.
//
// 
//
//Return the string A after reversing the string word by word.
//
//NOTE:
//
//    A sequence of non-space characters constitutes a word.
//    Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
//    If there are multiple spaces between words, reduce them to a single space in the reversed string.
//
// 
//
//
//Problem Constraints
//
//1 <= N <= 3 * 105
//
//
//Input Format

//The only argument given is string A.
//
//
//Output Format
//
//Return the string A after reversing the string word by word.
//
//
//Example Input
//
//Input 1:
//    A = "the sky is blue"
//
//Input 2:
//    A = "this is ib"
//
//
//
//Example Output
//
//Output 1:
//    "blue is sky the"
//
//Output 2:
//    "ib is this"
//
//
//
//Example Explanation
//
//Explanation 1:
//    We reverse the string word by word so the string becomes "the sky is blue".
//
//Explanation 2:
//    We reverse the string word by word so the string becomes "this is ib".


package stringsProblems;

public class ReverseTheString {

	public static void main(String[] args) {
		String s="the sky is blue";
		String s2="this is ib";
		
		System.out.println(reverseString(s));
		System.out.println(reverseString(s2));
	}
	public static String reverseString(String s) {
		String[] a=s.split("\\s+");
		StringBuilder sb= new StringBuilder();
		
		for(int i=a.length-1;i>=0;i--) {
			sb.append(a[i]);
			if(i>0) {
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
}
