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
    public TreeNode bstToGst(TreeNode root) {
          int sum = 0;
        TreeNode currentNode = root; 

       
        while (root != null) {
            if (root.right == null) {
                sum += root.val; 
                root.val = sum; 
                root = root.left;
            } else {
                TreeNode inorderSuccessor = root.right;
                while (inorderSuccessor.left != null && inorderSuccessor.left != root) {
                    inorderSuccessor = inorderSuccessor.left;
                }

                if (inorderSuccessor.left == null) {
                  
                    inorderSuccessor.left = root;
                    root = root.right;
                } else {
                  
                    sum += root.val;
                    root.val = sum; 
                    inorderSuccessor.left = null; 
                    root = root.left; 
                }
            }
        }
        return currentNode;
        
    }
}