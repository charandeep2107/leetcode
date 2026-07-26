class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int p=nums[n-1]*nums[n-2]*nums[n-3];
        int p1=nums[n-1]*nums[0]*nums[1];
        return Math.max(p,p1);
    }
}