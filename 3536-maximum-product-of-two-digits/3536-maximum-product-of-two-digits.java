class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> al=new ArrayList<>();
        
        while(n>0){
            al.add(n%10);
            n=n/10;
        }
        Collections.sort(al,Collections.reverseOrder());
        if(al.size()==1)
        return al.get(0);
        return al.get(0)*al.get(1);
    }
}