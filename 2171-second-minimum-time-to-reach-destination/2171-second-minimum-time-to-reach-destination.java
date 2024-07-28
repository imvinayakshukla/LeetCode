class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int[][] dist = new int[n + 1][2];
        for(int i = 0; i <= n; i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[1][0] = 0;

        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{1, 0});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u = curr[0];
            int t = curr[1];
            for(int v : graph.get(u)){
                int wait = 0;
                if((t / change) % 2 == 1){
                    wait = change - (t % change);
                }
                int newTime =   t + wait + time;
                if(newTime < dist[v][0]){
                    dist[v][1] = dist[v][0];
                    dist[v][0] = newTime;
                    pq.offer(new int[]{v, newTime});
                } else if(newTime > dist[v][0] && newTime < dist[v][1]) {
                    dist[v][1] = newTime;
                    pq.offer(new int[]{v, newTime});
                }
            }
        }
        return dist[n][1];
    }
}