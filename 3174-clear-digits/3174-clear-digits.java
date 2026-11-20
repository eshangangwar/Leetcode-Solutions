class Solution {
    public String clearDigits(String s) {
        String answer="";
        for(int i =0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='0' && ch<='9'){
                answer=answer.substring(0,answer.length()-1);
            }
            else answer=answer+ch;
        }
        return answer;
    }
}
