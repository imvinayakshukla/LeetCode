class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int sum=0;
        int m=rolls.length;
        for(int i=0;i<rolls.length;i++)
        sum+=rolls[i];

        int rem_sum=(mean*(m+n))-sum;

        int ans[]=new int[n];
        int distribute_sum=rem_sum/n;
        Arrays.fill(ans,distribute_sum);
        int mod=rem_sum%n;

         if (rem_sum > 6 * n || rem_sum < n) {
            return new int[0];
        }

        for(int i=0;i<mod;i++)
            ans[i]++;


            return ans;



        
    }
}