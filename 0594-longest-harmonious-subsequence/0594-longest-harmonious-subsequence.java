class Solution {
    public int findLHS(int[] nums) {
        int cnt = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
           

        }
        for (int i = 0; i < nums.length; i++) {

            if (mp.containsKey(nums[i] + 1)) {
                cnt = Math.max(cnt, mp.get(nums[i]) + mp.get(nums[i] + 1));

            }

        }
        return cnt;

    }
}