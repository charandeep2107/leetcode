class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> frq=new HashMap<>();
        List<Integer> dup=new ArrayList<>();
        for(int n:nums){
        frq.put(n,frq.getOrDefault(n,0)+1);
        if(frq.get(n)==2)
        dup.add(n);}
        int num=dup.get(0);
        return num;
    }
}