class Solution {
    public int smallestNumber(int n, int t) {
        boolean found=false;
        while(!found){
        int pro=1;
        int original=n;
        while(original>0){
            int digit=original%10;
            pro=digit*pro;
            original/=10;
        }
            if(pro%t==0)
            found=true;
            else
            n++; 
        }
        return n;
    }
}