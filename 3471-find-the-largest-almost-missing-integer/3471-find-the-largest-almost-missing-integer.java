class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                boolean alseen=false;
                for(int l=i;l<j;l++){
                    if(nums[l]==nums[j]){
                        alseen=true;
                        break;
                    }
                }
                if(!alseen)
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }
        }
        int ans=-1;
        for(int x: freq.keySet()){
            if(freq.get(x)==1)
            ans=Math.max(ans,x);
        }
        return ans;
    }
}