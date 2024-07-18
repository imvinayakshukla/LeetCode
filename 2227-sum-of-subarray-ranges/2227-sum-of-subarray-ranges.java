class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int small = nums[i], large = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                small = Math.min(small, nums[j]);
                large = Math.max(large, nums[j]);
                sum += large - small;
            }

        }
        return sum;

    }
}