
class Solution {

    static int findth(int piles[], int h) {
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {

            sum += Math.ceil((double) piles[i] / (double) h);
        }
        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = piles[0];
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);

        }
        System.out.println(high);

        while (low <= high) {
            int mid = (high + low) / 2;
            int th = findth(piles, mid);
            if (th <= h)

                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;

    }
}