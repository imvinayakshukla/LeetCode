class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(solve(nums, 0, nums.length - 2), solve(nums, 1, nums.length - 1));
    }

    private int solve(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 1];

        dp[0] = nums[start];
        if (dp.length > 1) {
            dp[1] = Math.max(nums[start], nums[start + 1]);
        }

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2], dp[i - 1]);
        }

        return dp[dp.length - 1];
    }
}
