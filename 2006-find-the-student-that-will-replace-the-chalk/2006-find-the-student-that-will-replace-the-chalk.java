class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }
        
        k %= totalChalk;

        int low = 0, high = chalk.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (func(chalk, k, mid)) { 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    
    public boolean func(int[] chalk, int k, int mid) {
        for (int i = 0; i <= mid; i++) {
            k -= chalk[i];
            if (k < 0) {
                return true;
            }
        }
        return false;
    }
}
