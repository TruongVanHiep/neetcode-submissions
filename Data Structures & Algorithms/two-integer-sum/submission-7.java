class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int hieu = target - nums[i];
            if(map.containsKey(hieu)){
                return new int[]{map.get(hieu), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; 
    }
}
