class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int res = 0;
        int mod = 1000000007;

        int[] pow = new int[n];
        pow[0] = 1;

        for (int i = 1; i < n; i++) {
            pow[i] = (2 * pow[i - 1]) % mod;
        }

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                res = (res + pow[r - l]) % mod;
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}