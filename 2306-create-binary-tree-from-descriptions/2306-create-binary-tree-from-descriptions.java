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
    public TreeNode createBinaryTree(int[][] descriptions) {
        int max = 0;
        for(int[] desc : descriptions){
            max = Math.max(max, Math.max(desc[0], desc[1]));
        }
        TreeNode[] map = new TreeNode[max + 1];
        int[] nwp = new int[max + 1];
        for(int[] desc : descriptions){
            TreeNode par = map[desc[0]];
            TreeNode curr = map[desc[1]];
            if(par == null){
                par = new TreeNode(desc[0]);
            }
            if(curr == null){
                curr = new TreeNode(desc[1]);
            }
            if(desc[2] == 1){
                par.left = curr;
            }else{
                par.right = curr;
            }
            map[par.val] = par;
            map[curr.val] = curr;
            if(nwp[par.val] != 2){
                nwp[par.val] = 1;
            }
            nwp[curr.val] = 2;
        }
        for(int i = 1; i < max + 1; i++){
            if(nwp[i] == 1){
                return map[i];
            }
        }
        return null;
    }
}