class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                int[] ans = {i, map.get(target - nums[i])};
                return ans;
            }
        }
        
        return null;
    }
}