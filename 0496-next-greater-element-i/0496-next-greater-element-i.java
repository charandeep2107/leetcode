class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int k=0;
            for(k=0;k<nums1.length;k++){
                if(nums2[k]==nums1[i]){
                break;}
            }
            for(int j=k;j<nums2.length;j++){
                
                if(nums2[j]>nums1[i]){
                ans[i]=nums2[j];
                break;
                }
                else{
                ans[i]=-1;}
                
            }
        }
        return ans;
    }
}