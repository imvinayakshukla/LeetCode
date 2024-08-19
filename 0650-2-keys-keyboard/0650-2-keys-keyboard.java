class Solution 
{
    public int minSteps(int n) 
    {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,dp);
    }
    public int memo(int n, int[] dp)
    {
        if(n==1)return 0;
        if(dp[n]!=-1)return dp[n];
        int min = Integer.MAX_VALUE;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                min = Math.min(min,memo(i,dp)+n/i);
            }
        }
        if(min==Integer.MAX_VALUE)min = n;
        return dp[n] = min;
    }
}