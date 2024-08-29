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
    public int kthSmallest(TreeNode root, int k) {
        int count[]=new int[]{0};
        int ksm[]=new int[]{0};

        inorder(root,k,count,ksm);

        return ksm[0];

        
    }
      public void   inorder(TreeNode root,int k,int[]count,int[]ksm){
        if(root==null)
        return ;

        inorder(root.left,k,count,ksm);
        count[0]++;
        if(count[0]==k)
        {
            ksm[0]=root.val;
            return;
        }
        inorder(root.right,k,count,ksm);


        }

}