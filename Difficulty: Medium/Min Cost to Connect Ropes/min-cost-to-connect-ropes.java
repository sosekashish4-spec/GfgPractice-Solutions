class Solution {
    public int minCost(int[] arr) {
         PriorityQueue<Integer>pq=new PriorityQueue<>();
         for(int ele:arr) pq.add(ele);
         int sum=0;
         int m=0;
         int n=0;
         int ad=0;
         while(pq.size()!=1){
             m=pq.remove();
             n=pq.remove();
             ad=m+n;
             sum+=ad;
             pq.add(ad);
         }
         return sum;
    }
}