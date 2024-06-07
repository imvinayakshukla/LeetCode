class Solution {
    public int findPeakElement(int[] nums) {

      
        if(nums.length==0 || nums.length==1)
        return 0;
        
        if(nums[0]>nums[1])
        return 0;

        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        

       for(int i=1;i<nums.length;i++)
       {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            {
                return i;
                
            }

       }
        // for(int j=0;j<nums.length;j++)
        // {
        //     if(nums[j]==max)
        //     return (j+1);
        // }
        return -1;
        
    }
}