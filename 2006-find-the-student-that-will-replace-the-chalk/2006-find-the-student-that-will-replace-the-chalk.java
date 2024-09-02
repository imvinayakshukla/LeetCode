class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // Step 1: Calculate total chalk needed for one complete round
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }
        
        // Step 2: Reduce k modulo totalChalk
        k %= totalChalk;

        // Step 3: Use binary search to find the first student who can't be given the chalk
        int low = 0, high = chalk.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (func(chalk, k, mid)) {  // Replace this with the appropriate condition
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    
    // Implement the func method, if needed
    private boolean func(int[] chalk, int k, int mid) {
        for (int i = 0; i <= mid; i++) {
            k -= chalk[i];
            if (k < 0) {
                return true;
            }
        }
        return false;
    }
}
