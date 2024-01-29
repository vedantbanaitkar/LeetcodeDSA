class Solution {
    public int maxProfit(int[] arr) {
        int minimum = arr[0];
        int maxP = 0;
        for(int i=0; i<arr.length; i++){
            int profit = arr[i]-minimum;
            maxP = Math.max(maxP, profit);
            minimum = Math.min(arr[i], minimum);
        }
        return maxP;
    }
}