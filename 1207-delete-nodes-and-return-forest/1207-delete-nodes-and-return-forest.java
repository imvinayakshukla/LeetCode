class Solution {
    public boolean dfs(TreeNode root, Set<Integer> toDelete, List<TreeNode> forest) {
        if (root == null)
            return false;
        if (root.left != null && dfs(root.left, toDelete, forest))
            root.left = null;

        if (root.right != null && dfs(root.right, toDelete, forest))
            root.right = null;

        if (toDelete.contains(root.val)) {
            if (root.left != null)
                forest.add(root.left);
            if (root.right != null)
                forest.add(root.right);
            return true;
        }
        return false;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> forest = new ArrayList<>();
        Set<Integer> toDelete = new HashSet<>();
        boolean rootPresent = true; // if root also to be deleted
        for (int i : to_delete) {
            toDelete.add(i);
        }
        if (dfs(root, toDelete, forest))
            rootPresent = false;
        if (rootPresent)
            forest.add(root);
        
        System.gc();
        return forest;
    }
}