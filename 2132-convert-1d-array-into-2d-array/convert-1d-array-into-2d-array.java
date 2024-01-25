class Solution {
    public int[][] construct2DArray(int[] nums, int m, int n) {
        if (nums.length != m * n) {
            return new int[0][0];
        }

        int[][] arr = new int[m][n];

        for (int i = 0; i < nums.length; i++) {
            arr[i / n][i % n] = nums[i];
        }

        return arr;
    }
}