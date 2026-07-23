class Solution {
     public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char top=st.peek();
            if(ch!=top) st.push(ch);
        }
        Stack<Character>st1=new Stack<>();
         reverse(st,st1);

         while(st1.size()!=0){
            char chr=st1.pop();
            sb.append(chr);
         }
         return sb.toString();
}
    public void reverse(Stack<Character>a,Stack<Character>b){
        while(a.size()!=0){
            char ch=a.pop();
            b.push(ch);
        }
    }
}