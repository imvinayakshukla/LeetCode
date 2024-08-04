class Solution {
    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return -1;
        }
        int n=nums[0];
        for(int i=0;i<nums.length;i++)
        n=Math.max(n,nums[i]);
        int hash[]=new int[n+1];

         for(int i=0;i<nums.length;i++)
         {
            hash[nums[i]]++;
         }
        for(int i=0;i<nums.length;i++)
        {
         if(hash[nums[i]]==1)
             return nums[i];
        }
        return -1;


       
    }
}