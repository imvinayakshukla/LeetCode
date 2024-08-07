class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer>queue=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++)
        queue.add(nums[i]);
       int f=k-1;
        while(f>0){
            queue.remove();
            f--;
        }
        

        return queue.peek();
    }
}