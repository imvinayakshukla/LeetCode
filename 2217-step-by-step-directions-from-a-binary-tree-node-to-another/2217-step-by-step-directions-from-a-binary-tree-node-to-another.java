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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca=findLCA(root,startValue,destValue);

        StringBuilder lcaToStart=new StringBuilder();
        StringBuilder lcaToDest=new StringBuilder();

        findPath(lca,startValue,lcaToStart);
        findPath(lca,destValue,lcaToDest);

        for(int i=0;i<lcaToStart.length();i++) {
            lcaToStart.setCharAt(i,'U');
        }

        return lcaToStart.toString()+lcaToDest.toString();
    }

    boolean findPath(TreeNode root,int target,StringBuilder sb) {
        if(root==null) return false;

        if(root.val==target) return true;

        sb.append("L");
        if(findPath(root.left , target, sb)) {
           return true; 
        }
        sb.setLength(sb.length()-1);

        sb.append("R");
        if(findPath(root.right,target,sb)) {
            return true;
        }
        sb.setLength(sb.length()-1);
        return false;
    }


    TreeNode findLCA(TreeNode root,int p,int q) {
        if(root==null) return null;
        if(root.val==p || root.val==q) return root;

        TreeNode left=findLCA(root.left,p,q);
        TreeNode right=findLCA(root.right,p,q);

        if(left!=null && right!=null) return root;
        if(left==null && right!=null) return right;
        else return left;
    }
}