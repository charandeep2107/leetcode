class Solution {
    public boolean checkDivisibility(int n) {
        if(n==0)
        return false;
        int original=n;
        int sum=0;
        int pro=1;
        while(original>0){
            int digit=original%10;
            sum+=digit;
            pro*=digit;
            original/=10;
        }
        return n%(sum+pro)==0;
        
    }
}