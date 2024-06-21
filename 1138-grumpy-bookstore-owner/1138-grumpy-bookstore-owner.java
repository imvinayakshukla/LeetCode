class Solution {
    public int maxSatisfied(int[] cust, int[] grumpy, int minutes) {

      int n = cust.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                total += cust[i];
            }
        }

        int curr = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                curr += cust[i];
            }
        }

        int max = curr;

        for (int i = minutes; i < n; i++) {
            if (grumpy[i] == 1) {
                curr += cust[i];
            }

            if (grumpy[i - minutes] == 1) {
                curr -= cust[i - minutes];
            }
            
            max = Math.max(max, curr);
        }

    return(total+max);

    }
}