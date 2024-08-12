class KthLargest 
{
    PriorityQueue<Integer> pq;
    final int k;

    public KthLargest(int k, int[] nums) 
    {
        this.k = k;
        this.pq = new PriorityQueue<Integer>(k);
        for(int num : nums) add(num);
    }
    
    public int add(int val) 
    {
       if(pq.size() < k)    pq.offer(val);

       else if(val > pq.peek())
       {
            pq.poll();
            pq.offer(val);
       }

        return pq.peek();
    }
}