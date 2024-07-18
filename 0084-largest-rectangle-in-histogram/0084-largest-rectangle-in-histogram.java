class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int leftA[] = new int[heights.length];
        int rightA[] = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            while (!st.empty() && heights[st.peek()] >= heights[i])
                st.pop();

            if (st.empty())
                leftA[i] = 0;
            else
                leftA[i] = st.peek()+1;

            st.push(i);
        }

        st.clear();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.empty() && heights[st.peek()] >= heights[i])
                st.pop();

            if (st.empty())
                rightA[i] = heights.length-1;
            else
                rightA[i] = st.peek()-1;

            st.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<heights.length;i++)
        {
            maxArea=Math.max(maxArea,heights[i]*(rightA[i]-leftA[i]+1));
        }

        return maxArea;
    }
}