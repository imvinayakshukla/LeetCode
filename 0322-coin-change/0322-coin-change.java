class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int[] r : dp)
            Arrays.fill(r, -1);

        int result = cal(coins, amount, coins.length - 1, dp);
        return result == Integer.MAX_VALUE - 1 ? -1 : result;

    }

    public static int cal(int coins[], int amount, int inx, int dp[][]) {

        if (amount == 0) {
            return 0;
        }
           if (inx < 0) return Integer.MAX_VALUE - 1;
        if (dp[inx][amount] != -1)
            return dp[inx][amount];

        int take = Integer.MAX_VALUE-1;
        if (coins[inx] <= amount)
            take =1+ cal(coins, amount - coins[inx], inx, dp);
        int not_take = cal(coins, amount, inx - 1, dp);

        return dp[inx][amount] = Math.min(take ,not_take);

    }
}