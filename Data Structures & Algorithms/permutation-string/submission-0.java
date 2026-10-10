class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for(int i = 0; i < len1; i++){
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }
        if(matches(s1count,s2count)){
            return true;
        }
        int left = 0;
        for(int right = len1 ; right < len2; right++){
            s2count[s2.charAt(right) - 'a']++;
            s2count[s2.charAt(left) - 'a']--;
            left++;

            if(matches(s1count,s2count)){
                return true;
            }
        }
        return false;
    }
    // Hàm phụ trợ để so sánh 2 mảng tần suất
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
