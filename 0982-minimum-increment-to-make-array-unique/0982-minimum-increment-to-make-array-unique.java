class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        //1,1,2,2,3,7
        int i,count=0,diff;
        for( i=1;i<nums.length;i++)
        {
           if(nums[i]<=nums[i-1])
           {
            diff=nums[i-1]-nums[i]+1;
            nums[i]+=diff;
            count+=diff;
           }

        }
        return count;



        
    }
}