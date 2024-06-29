class Solution {
    private int numVertices; 
    private List<Integer>[] graph; 
    private List<List<Integer>> ancestors; 
    
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        numVertices = n;
        graph = new List[n];
        Arrays.setAll(graph, i -> new ArrayList<>());
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }
        ancestors = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            ancestors.add(new ArrayList<>());
        }
      
        for (int i = 0; i < n; ++i) {
            bfs(i);
        }
        return ancestors;
    }

    
    private void bfs(int startVertex) {
        Deque<Integer> queue = new ArrayDeque<>(); 
        queue.offer(startVertex);
        boolean[] visited = new boolean[numVertices]; 
        visited[startVertex] = true;
      
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int adjacentNode : graph[currentNode]) {
                
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    queue.offer(adjacentNode);
                    ancestors.get(adjacentNode).add(startVertex);
                }
            }
        }
    }
}
