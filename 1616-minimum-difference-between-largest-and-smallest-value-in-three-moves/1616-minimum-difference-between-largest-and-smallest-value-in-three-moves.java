class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <=4)
            return 0;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=3;i++)
        {
            min=Math.min(min , nums[nums.length-1-i] - nums[3-i] );
        }

        return min;

        
    }
}