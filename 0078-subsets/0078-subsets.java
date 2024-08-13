class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        cal(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }

    public static void cal(int i, int[] nums, List<List<Integer>> ans, List<Integer> arr) {
        if (i == nums.length) {
            ArrayList<Integer> a = new ArrayList<>(arr);
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        cal(i + 1, nums, ans, arr);
        arr.remove(arr.size()-1);
        cal(i + 1, nums, ans, arr);

    }

}