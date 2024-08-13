class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = dp[i-1][j];
                int diagL = j == 0 ? Integer.MAX_VALUE : dp[i-1][j-1];
                int diagR = j == n-1 ? Integer.MAX_VALUE : dp[i-1][j+1];
                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(diagL, diagR));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[m-1][j]);
        }
        return ans;
    }
}