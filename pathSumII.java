import java.util.ArrayList;

class Solution{
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){

    }
    private void check(TreeNode root, int sum, List<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.val);
        sum -= root.val;
    if(root.left ==null && root.right ==  null){
        if(sum==0){
            res.add(new ArrayList<>(path));
        }
    }
    check(root.left,sum,path);
    check(root.right,sum,path);
    path.remove(path.size() - 1);
    }

}