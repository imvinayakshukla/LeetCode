class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int dp[][] = new int[triangle.size()][triangle.get(triangle.size() - 1).size()] ; 

        for (int[] row : dp)
            Arrays.fill(row, -1);
      

        return cal(triangle, 0,0, dp);
    }

    public static int cal(List<List<Integer>> triangle, int i, int j, int dp[][]) {
        if (i == triangle.size() - 1)
            return triangle.get(i).get(j);
        if (dp[i][j] != -1)
            return dp[i][j];

        int down =  cal(triangle, i + 1, j, dp);
        int diag =  cal(triangle, i+1, j + 1, dp);

        return dp[i][j] = Math.min(down, diag)+triangle.get(i).get(j) ;
    }
}