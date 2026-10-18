import java.util.Arrays;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        
        backtrack(1,n,k,comb,res);
        return res;
    }
    private void backtrack(int index, int n, int k, List<Integer> comb, List<List<Integer>> res){
        if(comb.size() == k){
            res.add(new ArrayList<>(comb));
            return;
        }
        for(int i = index; i<=n ; i++){
            comb.add(i);
            backtrack(i+1,n, k, comb, res);
            comb.remove(comb.size()-1);
        }
    }
}
