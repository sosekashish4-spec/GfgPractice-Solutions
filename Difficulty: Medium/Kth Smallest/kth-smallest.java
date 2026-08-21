class Solution {
    public int kthSmallest(int[] arr, int k) {
         PriorityQueue<Integer>pq=new PriorityQueue<>();
         for(int ele:arr) pq.add(ele);
         for(int i=1;i<k;i++) pq.remove();
         return pq.peek();
    }
}
