class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
       List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>mpp=new HashMap<>();

        for(int i=0;i<nums.length;i++)
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        
        
        for(Map.Entry<Integer,Integer>temp:mpp.entrySet())
        {
            if(temp.getValue()>(nums.length/3))
                ans.add(temp.getKey());
        }


       return ans;
    }
}