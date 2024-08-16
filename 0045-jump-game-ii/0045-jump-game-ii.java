class Solution {
    public int jump(int[] nums) {
        int jump = 0, farthest = 0, end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (end == i) {
                jump++;
                end = farthest;
            }
            if (end >= nums.length - 1) {
                break;
            }
        }
        return jump;
    }
}