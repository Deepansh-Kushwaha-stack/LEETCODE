class Solution {
    public int lengthOfLIS(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int ans = 1;
        for(int i=1; i<dp.length; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(arr[i] > arr[j]){
                    max = Math.max(max , dp[j]);
                }
            }
            dp[i] = max + 1;
            ans = Math.max(ans , dp[i]);
        }
        return ans;       
    }
}