import java.util.ArrayList;

class solution(){
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    private void inorder(List<Integer> res, TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        res.add(node.val);
        inorder(root.right);
    }
}