class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int count = 0;
        int left = 0;
        int right = 2;

        while (right < n) {
            if (nums[right] == nums[right - 1]) {
                right++;
                continue;
            }
            int curr=right - 1;
            if ((nums[curr] > nums[left] && nums[curr] > nums[right]) ||
                    (nums[curr] < nums[left] && nums[curr] < nums[right])) {
                count++;
            }

            left = right - 1;
            right++;
        }

        return count;
    }
}
