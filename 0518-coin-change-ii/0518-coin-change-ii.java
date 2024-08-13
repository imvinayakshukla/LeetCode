class Solution {
    public int change(int amount, int[] coins) {

        int dp[][] = new int[coins.length][amount + 1];
        for (int[] r : dp)
            Arrays.fill(r, -1);

        return cal(coins, amount, coins.length - 1, dp);

    }

    public static int cal(int coins[], int amount, int inx, int dp[][]) {

        if (inx == 0) {
            return (amount % coins[inx] == 0) ? 1 : 0;
        }
        if (dp[inx][amount] != -1)
            return dp[inx][amount];

        int take = 0;
        if (coins[inx] <= amount)
            take = cal(coins, amount - coins[inx], inx, dp);
        int not_take = cal(coins, amount, inx - 1, dp);

        return dp[inx][amount] = take + not_take;

    }
}