class Solution {

   public int sum(int[] nums, int goal) {
     int cnt=0,sum=0,l=0,r=0;

        if(goal < 0)
        return 0;

        while(r < nums.length)
        {
            sum+=nums[r]%2;

            while(sum > goal)
            {
                sum=sum-(nums[l]%2);
                l=l+1;
            }
            cnt+=(r-l+1);
            r=r+1;
        }

        return cnt;
}
    public int numberOfSubarrays(int[] nums, int k) {
        int goal=k;

    return (sum(nums,goal)-(sum(nums,goal-1)));

        
    }
}