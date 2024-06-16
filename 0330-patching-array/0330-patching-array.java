class Solution {
    public int minPatches(int[] nums, int n) {
        long coverage = 1;
        int patches = 0;
        int index = 0;

        while (coverage <= n) {
            if (index < nums.length && nums[index] <= coverage) {

                coverage += nums[index++];
            } else {

                patches++;

                coverage <<= 1;
            }
        }
        return patches;

    }
}