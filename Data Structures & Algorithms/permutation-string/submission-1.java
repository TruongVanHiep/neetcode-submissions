class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        // Nếu s1 dài hơn s2 thì chắc chắn không chứa được
        if (len1 > len2) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        // 1. Đếm tần suất cho s1 và cửa sổ đầu tiên của s2 (ĐẶT LÊN TRƯỚC)
        for(int i = 0 ; i < len1; i++){
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        } 
        
        // Kiểm tra ngay cửa sổ đầu tiên sau khi đã đếm xong
        if(matches(count1, count2)){
            return true;
        }
        
        // 2. Trượt cửa sổ qua s2
        int left = 0;
        for(int right = len1 ; right < len2; right++){
            count2[s2.charAt(right) - 'a']++; // Thêm ký tự bên phải
            count2[s2.charAt(left) - 'a']--;  // Bớt ký tự bên trái
            left++;
            
            if(matches(count1, count2)){
                return true;
            }
        }
        
        return false;
    }
    
    private boolean matches(int[] a, int[] b){
        for(int i = 0 ; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }  
        return true;
    }
}