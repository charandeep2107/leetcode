class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stt=new Stack<>();
        int n=prices.length;
        int[] ans =new int[n];
        for(int i=0;i<n;i++){
           while(!stt.isEmpty() && prices[stt.peek()]>=prices[i]){
               int a= stt.pop();
                ans[a]=prices[a]-prices[i];
           }
           stt.push(i);
            }
        while(!stt.isEmpty()){
            int a=stt.pop();
            ans[a]=prices[a];
        }  
    return ans;
    }
}