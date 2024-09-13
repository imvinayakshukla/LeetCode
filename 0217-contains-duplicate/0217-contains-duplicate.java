class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer>mpp=new HashMap<>();

        for(int i=0;i<nums.length;i++)
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

            System.out.println(mpp);

        for(Map.Entry<Integer,Integer> temp:mpp.entrySet())
        {
            if(temp.getValue()>=2)
                return true;
        }

        return false;
        
    }
}