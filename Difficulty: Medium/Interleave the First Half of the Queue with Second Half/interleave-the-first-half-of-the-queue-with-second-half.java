class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
         Queue<Integer> q1=new LinkedList<>();
         int n=q.size();
         for(int i=1;i<=n/2;i++) q1.add(q.remove());
         for(int i=1;i<=n/2;i++){
             q.add(q1.remove());
             q.add(q.remove());
         }
    }
}
