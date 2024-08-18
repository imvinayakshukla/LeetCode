class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return -1;
        }
        
        int num[] = new int[n];
        num[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            // Calculate the next ugly number
            int nextUgly = Math.min(Math.min(2 * num[i2], 3 * num[i3]), 5 * num[i5]);
            num[i] = nextUgly;

            // Increment indices accordingly
            if (nextUgly == 2 * num[i2]) i2++;
            if (nextUgly == 3 * num[i3]) i3++;
            if (nextUgly == 5 * num[i5]) i5++;
        }
        return num[n - 1];
    }
}