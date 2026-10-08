class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxCount = 0; // Lưu số lượng lần xuất hiện nhiều nhất của một ký tự trong cửa sổ hiện tại
        Map<Character, Integer> countMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // 1. Mở rộng cửa sổ: đếm tần suất xuất hiện của ký tự hiện tại
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            
            // Cập nhật maxCount (số lượng của ký tự xuất hiện nhiều nhất tính đến thời điểm này)
            maxCount = Math.max(maxCount, countMap.get(c));

            // 2. Kiểm tra điều kiện cửa sổ: 
            // Công thức: (Độ dài cửa sổ) - (maxCount) = Số ký tự cần phải thay đổi
            // Nếu số ký tự cần thay đổi lớn hơn k, cửa sổ không hợp lệ -> Co lại từ bên trái
            while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                countMap.put(leftChar, countMap.get(leftChar) - 1);
                left++; // Dịch con trỏ trái sang phải để thu hẹp cửa sổ
            }

            // 3. Cập nhật độ dài lớn nhất tìm được
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
