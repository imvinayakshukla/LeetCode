class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        int  j, k;
          Arrays.sort(nums);

      
        for (int i = 0; i < nums.length-2; i++) {
        if(i>0 && nums[i]==nums[i-1])
        continue;
        j = i + 1;
        k = nums.length - 1;
            while (j<k) {
               int  sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                   j++;
                   k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }

            }
        }
        return ans;
    }
}