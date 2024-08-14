
class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int vis[] = new int[nums.length];
        Arrays.fill(vis,0);
        List<Integer>ds= new ArrayList<>();
        cal(nums, vis,ds, ans);
        return ans;

    }

    public static void cal(int[] nums, int[] vis,List<Integer>ds, List<List<Integer>> ans) {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(vis[i]==0)
            {
                vis[i]=1;
                ds.add(nums[i]);
                cal(nums,vis,ds,ans);
                ds.remove(ds.size()-1);
                vis[i]=0;




            }
        }

    }
}