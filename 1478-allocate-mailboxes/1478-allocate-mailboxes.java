class Solution {
    public int minDistance(int[] hs, int k) {
        Arrays.sort(hs);
        int n = hs.length, dp[][] = new int[k + 1][n + 1]; 
        for (int i = 1; i <= k; i++) {
            for (int j = i + 1; j <= n; j++) {  
                if (i == 1) {
                    dp[i][j] = getCost(hs, 0, j - 1);
                    continue;
                }
                dp[i][j] = Integer.MAX_VALUE;
                for (int l = i - 1; l < j; l++) {  
                    dp[i][j] = Math.min(dp[i][j], getCost(hs, l, j - 1) + dp[i - 1][l]);
                }
            }
        }
        return dp[k][n];
    }
    
    private int getCost(int[] hs, int l, int r) {
        int res = 0;  
        while (l < r) res += hs[r--] - hs[l++];
        return res;
    }
}