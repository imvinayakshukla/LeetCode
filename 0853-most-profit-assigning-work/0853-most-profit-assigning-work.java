class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] job = new int[n][2];
        for (int i = 0; i < n; ++i) {
            job[i][0] = difficulty[i];
            job[i][1] = profit[i];
        }
        
        Arrays.sort(job, (a, b) -> Integer.compare(a[0], b[0]));
        
        Arrays.sort(worker);
        
        int res = 0;
        int i = 0;
        int t = 0;
       
        for (int w : worker) {
           
            while (i < n && job[i][0] <= w) {
                t = Math.max(t, job[i][1]);
                i++;
            }
            res += t;
        }
        
        return res;
    }
}