class Solution {
    public int sum(int[] nums, int goal) {
        int l = 0, r = 0, cnt = 0, sum = 0;
        if(goal < 0)
        return 0;

        while (r <nums.length) {
            sum += nums[r];

            while (sum > goal) {
                sum = sum - nums[l];
                l++;

            }
            cnt += (r - l + 1);
            r = r + 1;
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return (sum(nums,goal)-sum(nums,goal-1));
    }
}