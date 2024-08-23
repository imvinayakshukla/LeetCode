class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode current = root;
        
        while (current != null || !st.empty()) {
            // Reach the leftmost TreeNode
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            // Current must be null at this point
            current = st.pop();
            list.add(current.val);  // Add the node's value
            
            // Visit the right subtree
            current = current.right;
        }
        return list;
    }
}
