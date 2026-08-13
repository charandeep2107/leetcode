class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();
        for(int num:nums){
            if(!set.add(num))
            dup.add(num);
        }
        ArrayList<Integer> ans=new ArrayList<>(dup);
        return ans;
    }
}