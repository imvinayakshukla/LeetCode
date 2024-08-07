class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        if (k >= num.length())
            return "0";

        for (int i = 0; i < num.length(); i++) {
           
           while (k > 0 && !st.isEmpty() &&  num.charAt(i) < st.peek()) {
                st.pop();
                k--;
            }

            st.push( num.charAt(i));

        }

        while (k > 0) {

            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if (num.length() == 0)
            return "0";
        return sb.toString();

    }
}