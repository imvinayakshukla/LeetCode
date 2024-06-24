class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int flip = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!queue.isEmpty() && queue.peek() < i)
                queue.remove();

            if (queue.size() % 2 == nums[i]) {

                if (i + k - 1 >= nums.length)
                    return -1;

                queue.add(i + k - 1);
                flip++;

            }

        }
        return flip;
    }

}
