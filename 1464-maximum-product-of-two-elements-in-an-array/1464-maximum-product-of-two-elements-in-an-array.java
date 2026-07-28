class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int pro = 1;
        for(int i = nums.length-1; i>=nums.length-2; i--){    
            pro *= (nums[i]-1);
        }
        return pro;
    }
}