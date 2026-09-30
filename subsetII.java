import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        backtrack(0, nums, new ArrayList<>(), set);
        return new ArrayList<>(set);
    }

    void backtrack(int index, int[] nums, List<Integer> curr, Set<List<Integer>> set) {
        set.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, nums, curr, set);
            curr.remove(curr.size() - 1);
        }
    }
}