class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;
        int up, down, left, right;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    up = (r == 0 || grid[r - 1][c] == 0) ? 1 : 0;
                    left = (c == 0 || grid[r][c - 1] == 0) ? 1 : 0;
                    down = (r == rows - 1 || grid[r + 1][c] == 0) ? 1 : 0;
                    right = (c == cols - 1 || grid[r][c + 1] == 0) ? 1 : 0;

                    ans += up + left + right + down;
                }
            }
        }
        return ans;
    }
}
