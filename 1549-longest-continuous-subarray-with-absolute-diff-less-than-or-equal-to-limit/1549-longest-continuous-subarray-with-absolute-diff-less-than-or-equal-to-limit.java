class Solution {
    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> inc = new ArrayDeque<>();
        ArrayDeque<Integer> dec = new ArrayDeque<>();

        int j = 0, ans = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!inc.isEmpty() && inc.getLast() > nums[i])
                inc.removeLast();

            while (!dec.isEmpty() && dec.getLast() < nums[i])
                dec.removeLast();

            inc.addLast(nums[i]);
            dec.addLast(nums[i]);

            while (dec.getFirst() - inc.getFirst() > limit) {
                if (inc.getFirst() == nums[j])
                    inc.removeFirst();
                if (dec.getFirst() == nums[j])
                    dec.removeFirst();
                j++;
            }

            ans = Math.max(ans, i-j+ 1);
        }

        return ans;

    }
}