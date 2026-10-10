import java.util.Arrays;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, res, list, used);
        return res;
    }
    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[]used)
    {
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i =0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            list.add(nums[i]);
            used[i]= true;
            backtrack(nums,res,list,used);
            list.remove(list.size()-1);
            used[i] = false;
        }

    }
}
