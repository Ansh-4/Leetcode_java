class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        try{
            Thread sort = new Thread(()-> Arrays.sort(candidates));
            sort.start();
            sort.join();
        } catch(Exception e){

        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(target,0,candidates,res,list);
        return res;
    }
    private void backtrack(int target, int index, int[] candidates, List<List<Integer>> res, List<Integer>list){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || index == candidates.length){
            return;
        }
        list.add(candidates[index]);
        backtrack(target - candidates[index],index+1,candidates,res,list);
        list.remove(list.size()-1);

        int next = index + 1;

        while(next<candidates.length && candidates[index]==candidates[next]){
            next++;
        }
        backtrack(target,next,candidates,res,list);
    }
}
