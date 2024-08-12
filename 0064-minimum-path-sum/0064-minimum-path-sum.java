import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length]; 
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return cal(grid, grid.length - 1, grid[0].length - 1, dp);
    }

    public static int cal(int grid[][], int i, int j, int dp[][]) {
        if (i == 0 && j == 0)
            return grid[0][0];
        if (i < 0 || j < 0)
              return (int) Math.pow(10, 9);;
        if (dp[i][j] != -1)
            return dp[i][j];

             int up,left;

     up=  grid[i][j] + cal(grid, i - 1, j, dp);
        left=grid[i][j] + cal(grid, i, j - 1, dp);

        return dp[i][j] = Math.min(up, left);
    }
}
