class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> li=new ArrayList<>();
        for(int num:nums)
        set.add(num);
        Arrays.sort(nums);
        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(!set.contains(i))
            li.add(i);
        }
        return li;
    }
}