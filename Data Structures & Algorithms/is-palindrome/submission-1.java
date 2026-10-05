class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(null) || s.length() < 1) return false;
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char sLeft = s.charAt(left);
            char sRight = s.charAt(right);
            // Bỏ qua ký tự không phải chữ/số ở bên trái
            if(!Character.isLetterOrDigit(sLeft)){
                left++;
            } else if(!Character.isLetterOrDigit(sRight)){
                right--;
            }else if(Character.toLowerCase(sLeft) != Character.toLowerCase(sRight)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
