class Solution {
    Set<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         ans = new HashSet<>();
          Arrays.sort(nums);
        cal(0, nums, ans, new ArrayList<Integer>());

       return new ArrayList<List<Integer>>(ans);
    }
    public static void cal(int inx,int[]nums, Set<List<Integer>> ans, List<Integer> arr)
    {

        if(inx==nums.length)
        {
             
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[inx]);
        cal(inx+1,nums,ans,arr);
        arr.remove(arr.size()-1);
        cal(inx+1,nums,ans,arr);



        
    }
}