class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;
        int pos = -1;
        int a[] = new int[2];
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                
                pos = mid;
                low = mid + 1;
            }
            if (nums[mid] > target) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        a[1] = pos;

        low = 0;
        high = nums.length - 1;
        pos = -1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)
                    pos = mid;

            if (nums[mid] >= target) {
                
                high = mid - 1;
            } else
                low = mid + 1;
        }
        a[0] = pos;

        return a;
    }
}