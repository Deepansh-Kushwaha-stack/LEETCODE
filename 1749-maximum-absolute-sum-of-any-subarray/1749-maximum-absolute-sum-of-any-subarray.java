class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;

        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<n; i++){

            currSum = Math.max(nums[i] , currSum+nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        int minSum = nums[0];
        currSum = nums[0];
        for(int i=1; i<n; i++){

            currSum = Math.min(nums[i] , currSum+nums[i]);
            minSum = Math.min(currSum, minSum);
        }

        return Math.max(maxSum , Math.abs(minSum));
    }
}