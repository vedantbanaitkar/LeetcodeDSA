class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfN = (n*(n+1))/2;
        int s=0;
        for(int i=0; i<n; i++){
            s+=nums[i];
        }
        return sumOfN-s;
    }
}