class Solution {
    public int[] runningSum(int[] arr) {
        int sum=arr[0];
        for(int i=1; i<arr.length; i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
    }

}