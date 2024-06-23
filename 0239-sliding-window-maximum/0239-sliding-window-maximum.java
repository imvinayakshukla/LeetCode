class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int res[] = new int[nums.length - k + 1];
        int j=0;

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.getLast()] < nums[i])
                queue.removeLast();

            queue.add(i);
            if (queue.getFirst() + k == i)
                queue.removeFirst();

            if(i >= k-1)
                res[j++]=nums[queue.getFirst()];
        }

        return res;

    }
}