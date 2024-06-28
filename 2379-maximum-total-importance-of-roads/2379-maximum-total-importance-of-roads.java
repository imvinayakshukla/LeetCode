class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
      
        for (int[] road : roads) {
            ++degree[road[0]];
            ++degree[road[1]];
        }
      
        Arrays.sort(degree);
      
        long answer = 0;
      
        for (int i = 0; i < n; ++i) {
            answer += (long) (i + 1) * degree[i];
        }
      
        return answer;
    }
}