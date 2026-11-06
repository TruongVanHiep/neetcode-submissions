class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s == null) return false;

        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char sl = s.charAt(left);
            char sr = s.charAt(right);
            if(!Character.isLetterOrDigit(sl)){
                left++;
            }else if(!Character.isLetterOrDigit(sr)){
                right--;
            }else if(Character.toLowerCase(sl) != Character.toLowerCase(sr)){
                return false;
          // đây là kt trường hợp đúng, đúng thí đi tiếp
            }else{
                left++;
                right--; 
            }
        }
        return true;
    }
}
