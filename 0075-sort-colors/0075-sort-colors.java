class Solution {
    public void swap(int[]nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {

        int mid=0,low=0,high=nums.length-1;

        while(mid<=high)
        {
            
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }

            else if(nums[mid]==1)
                    mid++;

           else if(nums[mid]==2)
           {
            swap(nums,mid,high);
            high--;

           }

        }
        

    }
}