class Solution {
    public boolean func(int mid, int[] weights, int days) {
        int day = 1, total = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + total > mid) {
                day += 1;
                total = weights[i];
            } else
                total += weights[i];

        }
        if (day > days)
            return false;
            return true;
       
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int i : weights) {
            low = Math.max(low, i);
            high += i;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (func(mid, weights, days))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }
}