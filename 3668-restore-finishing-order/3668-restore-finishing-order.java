class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        HashSet set2=new HashSet<>();
        List<Integer> li=new ArrayList<>();
        
        for(int x:friends)
        set2.add(x);

        for(int x:order){
        if(set2.contains(x)){
            li.add(x);
        }
        }
        
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}