package Arrays;


//
//Best Time to Buy and Sell Stock
//You are given an array of prices where prices[i] is the price of a given stock on an ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
//Input: prices = [7,1,5,3,6,4], Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//

public class BestTimeToByStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max_profit=0;
		int min=Integer.MAX_VALUE;
		int price[]= {7,6,4,3,1};
		
		for(int i=0;i<price.length;i++) {
			if(price[i]<min) {
				min=price[i];
				for(int j=i+1;j<price.length;j++) {
					if(price[j]-min>max_profit) {
						max_profit=price[j]-min;
					}
				}
			}
		}
		System.out.println(max_profit);
		

	}

}
