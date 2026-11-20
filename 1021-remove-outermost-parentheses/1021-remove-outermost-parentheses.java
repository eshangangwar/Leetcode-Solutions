class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String a="";
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    a+=ch;
                }
                st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    a+=ch;
                }
            }
        }
        return a;
    }
}