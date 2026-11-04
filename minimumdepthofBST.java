class solution(){
    public int minDepth(TreeNode root){
        int min = Integer.MAX_VALUE;
        if(root == null){
            return 0;
        }
        check();
        return min;
    }
    private void check(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            min = Math.min(min,depth);
        }
        check(root.right,depth+1);
        check(root.left, depth+1);
    }
}