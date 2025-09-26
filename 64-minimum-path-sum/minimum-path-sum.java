class Solution {
    public int minPathSum(int[][] grid) {
        int l = grid.length;
        int b = grid[0].length;
        int[][] dp = new int[l][b];

        for(int i=0; i<l; i++){
            int[] k = new int[b];
            for(int j=0; j<b; j++){
                k[j] = 0;
            }
        }

        dp[0][0] = grid[0][0];

        for(int i=1; i<b; i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        for(int i=1; i<l; i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for(int i=1; i<l; i++){
            for(int j=1; j<b; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        return dp[l-1][b-1];
        
    }
}