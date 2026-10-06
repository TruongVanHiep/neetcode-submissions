class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        // Tìm đống chuối lớn nhất để làm biên phải (right)
        for (int pile : piles) {
            right = Math.max(pile,right);
        }
        int ans = right;
        while(left <= right){
            int mid = left + (right - left)/2;
            // Tính xem với tốc độ mid thì mất bao nhiêu giờ
            long totalHours = 0;
            for (int pile : piles) {
                // Công thức làm tròn lên: ceil(pile / mid)
                totalHours += (pile + mid - 1) / mid;
            }
            if(totalHours <= h){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
