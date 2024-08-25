/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return ans;
        boolean flag = true;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> li = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                if (flag) {
                    li.add(current.val);
                } else {
                    li.add(0, current.val); 
                }

                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);

            }
            flag = !flag;
            ans.add(li);

        }

        return ans;
    }
}