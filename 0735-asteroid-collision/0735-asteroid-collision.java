class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack <Integer>st=new Stack<>();
        for (int i = 0; i < ast.length; i++) {
            if (ast[i] > 0) {
                st.push(ast[i]);
            } else {
                boolean pushkarna = true;

                while (pushkarna && !st.isEmpty() && st.peek() > 0) {
                    if (st.peek() < Math.abs(ast[i])) {
                        st.pop();
                    } else if (st.peek() == Math.abs(ast[i])) {
                        st.pop();
                        pushkarna = false;
                    } else {
                        pushkarna = false;
                    }
                }

                if (pushkarna) {
                    st.push(ast[i]);
                }
            }
        }

        int n = st.size();
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}