package tasks;

public class Anelya {
    public static void main(String[] args) {
        int[] arr = {15,3,3,1,8,11,12,11,1};
        System.out.println(findMaxProfit(arr));
    }

    static int findMaxProfit(int[] arr){
        int len = arr.length;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = len-1; j > i ; j--) {
                int profit = arr[j]-arr[i];
                if (profit>maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }
}


/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
Write a Java function to find the maximum profit.
Note that a stock can’t be sold before buying.
Example:
Input: [15,3,3,1, 8,11,12,11, 1]
Output: 11
Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
Not 15-1 = 14, as the selling price needs to be larger than buying price.
 */