class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, map.get(c));
            while((right - left + 1) - maxCount > k){
                char ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
    return maxLength;
    }
}
