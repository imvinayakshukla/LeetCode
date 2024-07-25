class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=q.remove();
        }
        return nums;
        
    }
}