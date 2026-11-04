import java.util.ArrayList;

class solution(){
    public static List<Integer> preordertraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        po();
        return res;
    }
    private void po(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        po(root.left,res);
        po(root.right,res);

    }
}