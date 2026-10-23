class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        if(n == 1) return new int[] {0};
        
        int[] result = new int[n];
        for(int i = 0; i < n - 1; i++) {
        	int count = 1;
        	int j = i + 1;
        	while(j < n) {
        		if(temperatures[j] > temperatures[i])
        			break;
        		j++;
        		count++;
        	}
        	count = ( j == n) ? 0 : count;
        	result[i] = count;
        }
        return result;
    }
}
