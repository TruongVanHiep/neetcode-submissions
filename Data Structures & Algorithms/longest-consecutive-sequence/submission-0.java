class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longStreak = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int currentStreak = 1;
                while(set.contains(current + 1)){
                    current+=1;
                    currentStreak+=1;
                }
                longStreak = Math.max(longStreak, currentStreak);
            }

        }
        return longStreak;

    }
}
