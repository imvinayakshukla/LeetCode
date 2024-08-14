class Solution {
   static List<List<Integer>> ans;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        cal(0, candidates, target, new ArrayList<Integer>());
           List<List<Integer>> list = new ArrayList<>(ans);
        return list;

    }

    public static void cal(int inx, int[] arr, int target, ArrayList<Integer> ds) {
         if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (inx == arr.length) {
            return;
        }

        if (arr[inx] <= target) {
            ds.add(arr[inx]);
            cal(inx, arr, target - arr[inx], ds);
              ds.remove(ds.size() - 1);

        }
        cal(inx + 1, arr, target, ds);

    }
}