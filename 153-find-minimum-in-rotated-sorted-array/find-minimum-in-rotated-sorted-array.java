class Solution {

     public static int b(int[] arr, int low, int high, int ans){
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                ans = Math.min(ans, arr[low]);
                return b(arr, mid+1, high, ans);
            }
            else{
                ans = Math.min(ans, arr[mid]);
                return b(arr, low, mid-1, ans);
            }
        }
        return ans;
    }
    public int findMin(int[] nums) {
        return b(nums, 0, nums.length-1, Integer.MAX_VALUE);
    }
}