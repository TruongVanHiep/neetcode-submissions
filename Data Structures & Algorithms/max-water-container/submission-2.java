class Solution {
    public int maxArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        int n = heights.length;
        int left = 0, right = n - 1;
        int res = 0;
        while(left < right){
            int s = (right - left) * Math.min(heights[left], heights[right]);
            if(heights[left] < heights[right]){
                left++;
            }else if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
                right--;
            }
            res = Math.max(res, Math.max(s , res));
            
        }
        return res;
    }
}
