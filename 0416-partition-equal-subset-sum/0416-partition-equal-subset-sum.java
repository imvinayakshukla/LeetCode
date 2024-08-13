class Solution {
    public boolean canPartition(int[] nums) {

        int sum=0;
        for(int i:nums)
        sum+=i;

        if(sum%2!=0)
        return false;
        int k=sum/2;
        int dp[][]=new int [nums.length][k+1];

        for(int []rows:dp)
        Arrays.fill(rows,-1);

        return cal(nums.length-1,k,nums,dp);
        
    }
    public static boolean cal(int n,int target,int []nums,int[][]dp)
    {
        if(target==0)return true;
        if(n==0)return (nums[0]==target);
        if(dp[n][target]!=-1)
        return dp[n][target]==1?true:false;

        boolean take= false;
        if(target>=nums[n])
        take=cal(n-1,target-nums[n],nums,dp);
       boolean not_take=cal(n-1,target,nums,dp);

        dp[n][target]=(take) || (not_take)?1:0;

        return (take) || (not_take);


    }
}