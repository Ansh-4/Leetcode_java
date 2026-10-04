class solution{
  public List<List<Integer>> CombinationSum(int[] candidates, int target){
    List<List<Integer>> res = new ArrayList<>();
    backtrack(target, 0, candidates, res, list);
    return res;
  }
  private void backtrack(int target, int index, int[] candidates, List<List<Integer>> res, new ArrayList<>() list){
    if(target == 0){
      res.add(new ArrayList<>(list));
      return;
    }
    if(target<0 || index == candidates.length){
      return;
    }
    list.add(candidates[i});
    backtrack(target - candidates[i},index,candidates,res,list);
    list.remove(list.size() - 1);
    backtrack(target,index+1, candidates, res, list);
  }
}
