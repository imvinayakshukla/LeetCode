class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            ans[i] = -1;

        for (int i = 0; i < nums.length * 2; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i % nums.length]) {
                ans[st.pop()] = nums[i % nums.length];

            }
            if (i < nums.length)
                st.push(i);
        }

        return ans;

    }
}