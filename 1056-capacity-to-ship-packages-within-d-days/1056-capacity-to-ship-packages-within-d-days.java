class Solution {
    static boolean check(int capacity, int weights[], int D) {
        int day = 1, total = 0;

        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]+total>capacity)
            {
                day+=1;
                total=weights[i];
            }
            else
            total+=weights[i];
        }
        if(day>D)
        return false;
        return true;

    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (check(mid, weights, days))
                high = mid - 1;
            else
                low = mid + 1;

        }

        return low;

    }
}