class Solution {
    public static int histogram(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();

        // left

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i])
                st.pop();

            if (st.empty())
                left[i] = 0;
            else
                left[i] = st.peek() + 1;

            st.push(i);

        }
        st.clear();
        // right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i])
                st.pop();

            if (st.empty())
                right[i] = n-1;
            else
                right[i] = st.peek() - 1;

            st.push(i);

        }
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] + 1));
        }

        return maxArea;

    }

    public int maximalRectangle(char[][] matrix) {
         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int heights[]=new int[matrix[0].length];
        int maxarea = 0;
        for (int i = 0; i < matrix.length; i++) {
         
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] ++;
                } else {
                    heights[j] = 0;
                }

            }
                maxarea = Math.max(maxarea, histogram(heights));
        }

        return maxarea;

    }

}