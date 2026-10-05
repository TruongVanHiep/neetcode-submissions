class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a));

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = keys.get(i);
        }
        return res;
    }
}
