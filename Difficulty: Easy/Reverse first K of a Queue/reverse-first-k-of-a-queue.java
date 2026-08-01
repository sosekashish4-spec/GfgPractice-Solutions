class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer>st=new Stack<>();
        if(k>q.size()) return q;
        for(int i=0;i<k;i++) st.push(q.remove());
        while(st.size()!=0) q.add(st.pop());
        for(int j=0;j<q.size()-k;j++) q.add(q.remove());
        return q;
    }
}