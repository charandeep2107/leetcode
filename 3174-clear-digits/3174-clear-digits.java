class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        StringBuilder stt=new StringBuilder();
        for(char ch:s.toCharArray()){
            //stt.push(ch)
            if(Character.isDigit(ch)){
            if(stt.length()>0){
                    stt.deleteCharAt(stt.length()-1);
                }
            }
            else
            stt.append(ch);
        }
return stt.toString();
    }
}