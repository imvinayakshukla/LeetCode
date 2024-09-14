class Solution {
    public int longestSubarray(int[] nums) {

        int len = 0;
        int ans = 0;

        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]==maxi)
                len++;
            else
            len=0;

            ans=Math.max(ans,len);
        }

            return ans;

    }
}