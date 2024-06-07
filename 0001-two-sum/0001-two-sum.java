class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int a[]=new int[2];
        int k=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int b=nums[i];
                int remaining=target-b;
                if(ans.containsKey(remaining))
                {
                    
                    a[0]=ans.get(remaining);
                    a[1]=i;
                }

                ans.put(nums[i],i);
            }
            return a;
    
    }
}