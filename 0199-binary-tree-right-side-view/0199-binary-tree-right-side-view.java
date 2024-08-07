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
    public static void right(TreeNode root, int level, ArrayList<Integer> list) {
        if (root == null)
            return;

        if (level == list.size())
            list.add(root.val);
            
        right(root.right, level + 1, list);
        right(root.left, level + 1, list);

    }

    public List<Integer> rightSideView(TreeNode root) {
        int level = 0;
        ArrayList<Integer> list = new ArrayList<>();
        right(root, level, list);

        return list;
    }
}