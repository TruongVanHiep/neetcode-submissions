class Solution {
    //Longest Repeating Character Replacement
    // số kí tự cần thay đổi = (độ dài của sổ) - (tuần xuất của kí tự xuất hiện nhiều nhất )

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, map.get(c));
            if(((right - left + 1) - maxCount)>k){
                char ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
