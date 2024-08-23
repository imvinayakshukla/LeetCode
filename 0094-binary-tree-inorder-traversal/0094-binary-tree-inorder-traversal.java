class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode current = root;
        
        while (current != null || !st.empty()) {
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            list.add(current.val); 
            
            current = current.right;
        }
        return list;
    }
}
