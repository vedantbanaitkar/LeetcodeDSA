class Solution {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return (nums[l-1]-1)*(nums[l-2]-1);
    }
}