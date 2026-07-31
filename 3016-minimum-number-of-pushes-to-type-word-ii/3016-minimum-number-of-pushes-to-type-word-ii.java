class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> map=new HashMap<>();
        for(char s:word.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Integer> freq=new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());  
        
        int count=0;
        for(int i=0;i<freq.size();i++){
            count+=freq.get(i)*((i/8)+1);
        }
        return count;
    }
}