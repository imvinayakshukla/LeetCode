class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int dp[][] = new int[text1.length()][text2.length()];

        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        return fn(text1,text2,text1.length()-1,text2.length()-1,dp);
        
    }
    static int fn(String s1,String s2,int inx1,int inx2,int[][]dp)
    {
        if(inx1<0 || inx2<0) return 0;
        if(dp[inx1][inx2]!=-1)
        return dp[inx1][inx2];
        if(s1.charAt(inx1)==s2.charAt(inx2))
        return  dp[inx1][inx2]=  1+fn(s1,s2,inx1-1,inx2-1,dp);
        else
        return dp[inx1][inx2]= 0+Math.max(fn(s1,s2,inx1,inx2-1,dp),fn(s1,s2,inx1-1,inx2,dp));

    }
}