class Solution {
    public int search(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);

    }

    public static int binary(int a[], int low, int high, int target) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target)
                return mid;
            if (a[mid] > target) {
                return binary(a, low, mid - 1, target);
            }

            return binary(a, mid + 1, high, target);
        }
        return -1;

    }
}