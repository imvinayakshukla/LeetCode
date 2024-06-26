/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> treeValues;

    public TreeNode balanceBST(TreeNode root) {
        treeValues = new ArrayList<>();
        inOrderTraversal(root);
        return buildBalancedTree(0, treeValues.size() - 1);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        treeValues.add(node.val);
        inOrderTraversal(node.right);
    }

    private TreeNode buildBalancedTree(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(treeValues.get(mid));
        root.left = buildBalancedTree(start, mid - 1);
        root.right = buildBalancedTree(mid + 1, end);
        return root;
    }
}
