class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Important for large k
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
    }
}