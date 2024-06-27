class Solution {
    public int findCenter(int[][] edges) {
         int firstVertexOfFirstEdge = edges[0][0];
        int secondVertexOfFirstEdge = edges[0][1];
      
        int firstVertexOfSecondEdge = edges[1][0];
        int secondVertexOfSecondEdge = edges[1][1];
      
       
        if (firstVertexOfFirstEdge == firstVertexOfSecondEdge || firstVertexOfFirstEdge == secondVertexOfSecondEdge) {
            return firstVertexOfFirstEdge;
        } else {
            return secondVertexOfFirstEdge;
        }
    }
}