class Solution {
    public void reverse(int nums[],int start,int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    end--;
                    start++;
        }
    }
    public void nextPermutation(int[] nums) {

        //find break-point
        int inx=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
                {
                    inx=i;
                    break;
                }
        }
        if(inx==-1)
            {
                reverse(nums,0,nums.length-1);
                return;
            }

         for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[inx])
                {
                    int temp=nums[i];
                    nums[i]=nums[inx];
                    nums[inx]=temp;
                    break;
                }
        }

        reverse(nums,inx+1,nums.length-1);
    }
}