class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int offset = 1;
        
        for(int i = 1; i < n + 1; i++) {
            if(2 * offset == i) {
                offset *= 2;
            }
            
            
            ans[i] = ans[i - offset] + 1;
        }
        
        return ans;
    }
}