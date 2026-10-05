class Solution {
    public boolean isAnagram(String s, String t) {
		int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort,tSort);
    }
}




