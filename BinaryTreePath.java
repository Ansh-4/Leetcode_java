class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, res, "");
        return res;
    }

    private void dfs(TreeNode root, List<String> res, String path) {
        if (root == null) {
            return;
        }

        path += root.val;

        if (root.left == null && root.right == null) {
            res.add(path);
            return;
        }

        path += "->";

        dfs(root.left, res, path);
        dfs(root.right, res, path);
    }
}
