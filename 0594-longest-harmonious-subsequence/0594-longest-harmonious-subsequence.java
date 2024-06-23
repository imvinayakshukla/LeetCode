class Solution {
    public int findLHS(int[] nums) {
        int cnt=0;

        for(int i=0;i<nums.length;i++)
        {
            int cur=0;
            boolean flag=false;

            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==nums[i])
                {
                    cur++;
                    
                }
                  if(nums[j]==(1+nums[i]))
                {
                    cur++;
                    flag=true;
                }
            }
            if(flag)
            cnt=Math.max(cnt,cur);
        }
        return cnt;
        
    }
}