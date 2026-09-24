import java.util.HashMap;

class solution{
    public int twosum(int[]nums, int target){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int compliment = target - nums[i];
            if(map.contains(compliment)){
                return new int[]{map.contains(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[];
    }
}