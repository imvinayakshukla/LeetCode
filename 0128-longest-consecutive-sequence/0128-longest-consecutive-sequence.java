class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        int count=0,longest=1;

        HashSet<Integer>ans=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            ans.add(nums[i]);
        }
        for(int num:ans)
        {
            if(!ans.contains(num-1))
            {
                int x=num;
                count=1;

                while(ans.contains(x+1))
                {
                    x=x+1;
                    count++;
                }
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}